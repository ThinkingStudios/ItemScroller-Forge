package fi.dy.masa.itemscroller.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.network.packet.Packet;
import fi.dy.masa.itemscroller.util.ClickPacketBuffer;

@Mixin(ClientPlayerInteractionManager.class)
public class MixinClientPlayerInteractionManager
{
    @Inject(method = "clickSlot", at = @At("HEAD"), cancellable = true)
    private void cancelWindowClicksWhileReplayingBufferedPackets(CallbackInfo ci)
    {
        if (ClickPacketBuffer.shouldCancelWindowClicks())
        {
            ci.cancel();
        }
    }

    @Redirect(method = "clickSlot", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/network/ClientPlayNetworkHandler;sendPacket(Lnet/minecraft/network/packet/Packet;)V"))
    private void bufferClickPacketsAndCancel(ClientPlayNetworkHandler netHandler, Packet<?> packet)
    {
        if (ClickPacketBuffer.shouldBufferClickPackets())
        {
            ClickPacketBuffer.bufferPacket(packet);
            return;
        }

        netHandler.sendPacket(packet);
    }
}

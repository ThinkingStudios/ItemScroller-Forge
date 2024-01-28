package fi.dy.masa.itemscroller.mixin.compat;

import fi.dy.masa.itemscroller.event.RenderEventHandler;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraftforge.client.ForgeHooksClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ForgeHooksClient.class, remap = false)
public abstract class MixinForgeHooksClient {
    @Inject(method = "drawScreen", at = @At("RETURN"))
    private static void onDrawScreenPost(Screen screen, MatrixStack poseStack, int mouseX, int mouseY, float partialTick, CallbackInfo ci)
    {
        RenderEventHandler.instance().onDrawScreenPost(MinecraftClient.getInstance());
    }
}

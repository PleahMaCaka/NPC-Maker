package io.github.pleahmacaka.maker.mixins.bindings;

import io.github.pleahmacaka.maker.MakerMOD;
import io.github.pleahmacaka.maker.bindings.ExampleMixinBinding;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(TitleScreen.class)
public class ExampleMixin {

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        MakerMOD.INSTANCE.getLogger().info("Example Mixin Loaded!");
        ExampleMixinBinding.INSTANCE.start();
    }

}
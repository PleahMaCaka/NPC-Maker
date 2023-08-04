package io.github.pleahmacaka.maker.client

import io.github.pleahmacaka.maker.MakerMOD
import net.fabricmc.api.ClientModInitializer

object MakerClient : ClientModInitializer {

    private val logger = MakerMOD.logger

    override fun onInitializeClient() {
        logger.info("Hello Fabric! from client")
    }

}

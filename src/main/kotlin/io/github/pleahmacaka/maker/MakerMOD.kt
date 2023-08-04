package io.github.pleahmacaka.maker

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val MODID = "maker"

object MakerMOD : ModInitializer {

    val logger: Logger = LoggerFactory.getLogger(MODID)

    override fun onInitialize() {
        logger.info("Hello Fabric!")
    }

}

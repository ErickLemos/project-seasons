package org.cabradati.projectseasons

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory


object ProjectSeasons : ModInitializer {
    private val logger = LoggerFactory.getLogger("project-seasons")

    override fun onInitialize() {
        ItemModule.init()
        logger.info("Hello Fabric world!")
    }
}
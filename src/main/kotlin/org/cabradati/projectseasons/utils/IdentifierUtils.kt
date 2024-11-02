package org.cabradati.projectseasons.utils

import net.minecraft.util.Identifier

fun modIdentifier(itemName: String): Identifier {
    return Identifier.of(Constants.MOD_ID, itemName)
}
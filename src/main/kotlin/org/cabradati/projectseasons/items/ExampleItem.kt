package org.cabradati.projectseasons.items

import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.util.Identifier
import org.cabradati.projectseasons.utils.modIdentifier


class ExampleItem(settings: Settings = Settings()) : Item(settings) {
    companion object {
        private val identifier: Identifier = modIdentifier("example")
        val registered: ExampleItem = Registry.register(Registries.ITEM, identifier, ExampleItem())
        val group: RegistryKey<ItemGroup> = ItemGroups.INGREDIENTS
    }
}
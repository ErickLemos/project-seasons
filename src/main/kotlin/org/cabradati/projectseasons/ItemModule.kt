package org.cabradati.projectseasons

import org.cabradati.projectseasons.items.ExampleItem
import org.cabradati.projectseasons.utils.addItemToGroup

object ItemModule {

    fun init() {
        initGroups()
    }

    private fun initGroups() {
        addItemToGroup(ExampleItem.group, ExampleItem.registered)
    }

}
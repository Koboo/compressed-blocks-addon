package eu.koboo.nova.compressed.blocks.registry

import eu.koboo.nova.compressed.blocks.CompressedBlocksAddon
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init

@Init
object Items : ItemRegistry by CompressedBlocksAddon.registry {

    val COBBLESTONE_1X = registerItem(Blocks.COBBLESTONE_1X)
}
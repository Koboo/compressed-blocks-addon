package eu.koboo.nova.compressed.blocks.registry

import eu.koboo.nova.compressed.blocks.CompressedBlocksAddon
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init

@Init
object Items : ItemRegistry by CompressedBlocksAddon.registry {


    val COBBLED_DEEPSLATE_1X = registerItem(Blocks.COBBLED_DEEPSLATE_1X)
    val COBBLED_DEEPSLATE_2X = registerItem(Blocks.COBBLED_DEEPSLATE_2X)
    val COBBLED_DEEPSLATE_3X = registerItem(Blocks.COBBLED_DEEPSLATE_3X)
    val COBBLED_DEEPSLATE_4X = registerItem(Blocks.COBBLED_DEEPSLATE_4X)

    val COBBLESTONE_1X = registerItem(Blocks.COBBLESTONE_1X)
    val COBBLESTONE_2X = registerItem(Blocks.COBBLESTONE_2X)
    val COBBLESTONE_3X = registerItem(Blocks.COBBLESTONE_3X)
    val COBBLESTONE_4X = registerItem(Blocks.COBBLESTONE_4X)

    val SAND_1X = registerItem(Blocks.SAND_1X)
    val SAND_2X = registerItem(Blocks.SAND_2X)
    val SAND_3X = registerItem(Blocks.SAND_3X)
    val SAND_4X = registerItem(Blocks.SAND_4X)

    val STONE_1X = registerItem(Blocks.STONE_1X)
    val STONE_2X = registerItem(Blocks.STONE_2X)
    val STONE_3X = registerItem(Blocks.STONE_3X)
    val STONE_4X = registerItem(Blocks.STONE_4X)
}
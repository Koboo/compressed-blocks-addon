package eu.koboo.nova.compressed.blocks.registry

import eu.koboo.nova.compressed.blocks.CompressedBlocksAddon
import org.bukkit.Material
import xyz.xenondevs.nova.addon.registry.BlockRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.item.options.BlockOptions
import xyz.xenondevs.nova.item.tool.VanillaToolCategories
import xyz.xenondevs.nova.item.tool.VanillaToolTiers
import xyz.xenondevs.nova.world.block.sound.SoundGroup

@Init
object Blocks : BlockRegistry by CompressedBlocksAddon.registry {

    private val OPTIONS_STONE = BlockOptions(
            3.0,
            VanillaToolCategories.PICKAXE,
            VanillaToolTiers.WOOD,
            true,
            SoundGroup.STONE,
            Material.COBBLESTONE
    )
    private val OPTIONS_COBBLED_DEEPSLATE = BlockOptions(
            3.5,
            VanillaToolCategories.PICKAXE,
            VanillaToolTiers.WOOD,
            true,
            SoundGroup.STONE,
            Material.COBBLED_DEEPSLATE
    )
    private val OPTIONS_SAND = BlockOptions(
            1.5,
            VanillaToolCategories.SHOVEL,
            VanillaToolTiers.WOOD,
            false,
            SoundGroup.SAND,
            Material.SAND
    )

    val COBBLED_DEEPSLATE_1X = block("compressed_cobbled_deepslate_1x").blockOptions(OPTIONS_COBBLED_DEEPSLATE).register()
    val COBBLED_DEEPSLATE_2X = block("compressed_cobbled_deepslate_2x").blockOptions(OPTIONS_COBBLED_DEEPSLATE).register()
    val COBBLED_DEEPSLATE_3X = block("compressed_cobbled_deepslate_3x").blockOptions(OPTIONS_COBBLED_DEEPSLATE).register()
    val COBBLED_DEEPSLATE_4X = block("compressed_cobbled_deepslate_4x").blockOptions(OPTIONS_COBBLED_DEEPSLATE).register()

    val COBBLESTONE_1X = block("compressed_cobblestone_1x").blockOptions(OPTIONS_STONE).register()
    val COBBLESTONE_2X = block("compressed_cobblestone_2x").blockOptions(OPTIONS_STONE).register()
    val COBBLESTONE_3X = block("compressed_cobblestone_3x").blockOptions(OPTIONS_STONE).register()
    val COBBLESTONE_4X = block("compressed_cobblestone_4x").blockOptions(OPTIONS_STONE).register()

    val SAND_1X = block("compressed_sand_1x").blockOptions(OPTIONS_SAND).register()
    val SAND_2X = block("compressed_sand_2x").blockOptions(OPTIONS_SAND).register()
    val SAND_3X = block("compressed_sand_3x").blockOptions(OPTIONS_SAND).register()
    val SAND_4X = block("compressed_sand_4x").blockOptions(OPTIONS_SAND).register()

    val STONE_1X = block("compressed_stone_1x").blockOptions(OPTIONS_STONE).register()
    val STONE_2X = block("compressed_stone_2x").blockOptions(OPTIONS_STONE).register()
    val STONE_3X = block("compressed_stone_3x").blockOptions(OPTIONS_STONE).register()
    val STONE_4X = block("compressed_stone_4x").blockOptions(OPTIONS_STONE).register()
}
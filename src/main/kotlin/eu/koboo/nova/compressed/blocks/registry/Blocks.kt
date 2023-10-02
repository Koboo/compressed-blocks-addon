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

    private val OPTIONS_COBBLESTONE_1X = BlockOptions(
            3.0,
            VanillaToolCategories.PICKAXE,
            VanillaToolTiers.WOOD,
            true,
            SoundGroup.STONE,
            Material.COBBLESTONE
    )

    val COBBLESTONE_1X = block("compressed_cobblestone_1x").blockOptions(OPTIONS_COBBLESTONE_1X).register()
}
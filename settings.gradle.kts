rootProject.name = "compressed_blocks"

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal { content { includeGroup("org.spigotmc") } }
        mavenCentral()
        maven("https://libraries.minecraft.net")
        maven("https://repo.xenondevs.xyz/releases")
    }
    versionCatalogs {
        create("libs") {
            from("xyz.xenondevs.nova:catalog:0.14.10")
        }
    }
}

pluginManagement {
    repositories {
        mavenLocal { content { includeGroup("org.spigotmc") } }
        mavenCentral()
        maven("https://repo.xenondevs.xyz/releases")
    }
}
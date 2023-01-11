package com.redmondstudio.slimefungeyser;

import org.geysermc.event.subscribe.Subscribe;
import org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomItemsEvent;
import org.geysermc.geyser.api.event.lifecycle.GeyserPreInitializeEvent;
import org.geysermc.geyser.api.extension.Extension;
import org.geysermc.geyser.api.item.custom.CustomItemData;
import org.geysermc.geyser.api.item.custom.CustomItemOptions;

public class Slimefun implements Extension {
    @Subscribe
    public void onPreInitialize(GeyserPreInitializeEvent event) {
        this.logger().info("");
        this.logger().info("##############################################");
        this.logger().info("SLIMEFUN GEYSER EXTENSION");
        this.logger().info("Made by: Sofia Redmond, Redmond Studio");
        this.logger().info("##############################################");
        this.logger().info("");
    }

    @Subscribe
    public void onGeyserPreInitializeEvent(GeyserDefineCustomItemsEvent event) {
		
		//
		// STICK
		//
		
        CustomItemData grandmas_walking_stick = CustomItemData.builder()
                .name("grandmas_walking_stick")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200011).build())
                .textureSize(16)
                .build();
        event.register("minecraft:stick", grandmas_walking_stick);
		
		CustomItemData grandpas_walking_stick = CustomItemData.builder()
                .name("grandpas_walking_stick")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200012).build())
                .textureSize(16)
                .build();
        event.register("minecraft:stick", grandpas_walking_stick);

		CustomItemData elemental_staff = CustomItemData.builder()
                .name("elemental_staff")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200133).build())
                .textureSize(16)
                .build();
        event.register("minecraft:stick", elemental_staff);

		CustomItemData elemental_staff_wind = CustomItemData.builder()
                .name("elemental_staff_wind")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200134).build())
                .textureSize(16)
                .build();
        event.register("minecraft:stick", elemental_staff_wind);

		CustomItemData elemental_staff_water = CustomItemData.builder()
                .name("elemental_staff_water")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200135).build())
                .textureSize(16)
                .build();
        event.register("minecraft:stick", elemental_staff_water);

		CustomItemData elemental_staff_fire = CustomItemData.builder()
                .name("elemental_staff_fire")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200160).build())
                .textureSize(16)
                .build();
        event.register("minecraft:stick", elemental_staff_fire);

		CustomItemData elemental_staff_storm = CustomItemData.builder()
                .name("elemental_staff_storm")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200161).build())
                .textureSize(16)
                .build();
        event.register("minecraft:stick", elemental_staff_storm);

        CustomItemData splint = CustomItemData.builder()
                .name("splint")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200225).build())
                .textureSize(16)
                .build();
        event.register("minecraft:stick", splint);

        //
		// GOLDEN_SWORD
		//
		
		CustomItemData slimefun_guide_icon = CustomItemData.builder()
                .name("slimefun_guide_icon")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200001).build())
                .textureSize(16)
                .build();
        event.register("minecraft:golden_sword", slimefun_guide_icon);
		
		CustomItemData blade_of_vampires = CustomItemData.builder()
                .name("blade_of_vampires")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200237).build())
                .textureSize(16)
                .build();
        event.register("minecraft:golden_sword", blade_of_vampires);

        //
		// IRON_AXE
		//
		
		CustomItemData seismic_axe = CustomItemData.builder()
                .name("seismic_axe")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200270).build())
                .textureSize(16)
                .build();
        event.register("minecraft:iron_axe", seismic_axe);

        //
		// DIAMOND_SWORD
		//
		
		CustomItemData soulbound_sword = CustomItemData.builder()
                .name("soulbound_sword")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200272).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_sword", soulbound_sword);

        //
		// TRIDENT
		//
		
		CustomItemData soulbound_trident = CustomItemData.builder()
                .name("soulbound_trident")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200273).build())
                .textureSize(16)
                .build();
        event.register("minecraft:trident", soulbound_trident);
		
		//
		// PLAYER_HEAD
		//
		
		CustomItemData wiki = CustomItemData.builder()
                .name("wiki")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200006).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", wiki);
		
		CustomItemData portable_crafter = CustomItemData.builder()
                .name("portable_crafter")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200013).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", portable_crafter);
		
		CustomItemData portable_dustbin = CustomItemData.builder()
                .name("portable_dustbin")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200018).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", portable_dustbin);
		
		CustomItemData ender_backpack = CustomItemData.builder()
                .name("ender_backpack")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200036).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", ender_backpack);
		
		CustomItemData battery = CustomItemData.builder()
                .name("battery")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200060).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", battery);
		
        CustomItemData synthetic_sapphire = CustomItemData.builder()
                .name("synthetic_sapphire")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200089).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", synthetic_sapphire);
		
		CustomItemData raw_carbonado = CustomItemData.builder()
                .name("raw_carbonado")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200091).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", raw_carbonado);
		
		CustomItemData carbonado = CustomItemData.builder()
                .name("carbonado")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200094).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", carbonado);

        CustomItemData carbon = CustomItemData.builder()
                .name("carbon")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200113).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", carbon);
		
		CustomItemData compressed_carbon = CustomItemData.builder()
                .name("compressed_carbon")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200116).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", compressed_carbon);
		
		CustomItemData carbon_chunk = CustomItemData.builder()
                .name("carbon_chunk")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200117).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", carbon_chunk);
		
		CustomItemData power_crystal = CustomItemData.builder()
                .name("power_crystal")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200119).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", power_crystal);
		
		CustomItemData stone_chunk = CustomItemData.builder()
                .name("stone_chunk")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200155).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", stone_chunk);
		
		CustomItemData lava_crystal = CustomItemData.builder()
                .name("lava_crystal")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200159).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", lava_crystal);
		
		CustomItemData cheese = CustomItemData.builder()
                .name("cheese")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200200).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", cheese);
		
		CustomItemData butter = CustomItemData.builder()
                .name("butter")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200201).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", butter);
		
		CustomItemData tiny_pile_of_uranium = CustomItemData.builder()
                .name("tiny_pile_of_uranium")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200214).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", tiny_pile_of_uranium);
		
		CustomItemData small_chunk_of_uranium = CustomItemData.builder()
                .name("small_chunk_of_uranium")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200215).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", small_chunk_of_uranium);
		
        CustomItemData uranium = CustomItemData.builder()
                .name("uranium")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200216).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", uranium);
		
		CustomItemData tin_can = CustomItemData.builder()
                .name("tin_can")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200226).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", tin_can);
		
		CustomItemData small_backpack = CustomItemData.builder()
                .name("small_backpack")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200248).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", small_backpack);
		
		CustomItemData medium_backpack = CustomItemData.builder()
                .name("medium_backpack")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200249).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", medium_backpack);
		
		CustomItemData large_backpack = CustomItemData.builder()
                .name("large_backpack")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200250).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", large_backpack);
		
		CustomItemData woven_backpack = CustomItemData.builder()
                .name("woven_backpack")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200251).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", woven_backpack);
		
		CustomItemData gilded_backpack = CustomItemData.builder()
                .name("gilded_backpack")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200253).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", gilded_backpack);
		
		CustomItemData radiant_backpack = CustomItemData.builder()
                .name("radiant_backpack")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200254).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", radiant_backpack);
		
		CustomItemData magnet = CustomItemData.builder()
                .name("magnet")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200256).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", magnet);
		
		CustomItemData infused_magnet = CustomItemData.builder()
                .name("infused_magnet")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200257).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", infused_magnet);
		
		CustomItemData necrotic_skull = CustomItemData.builder()
                .name("necrotic_skull")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200259).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", necrotic_skull);
		
		CustomItemData bound_backpack = CustomItemData.builder()
                .name("bound_backpack")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200261).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", bound_backpack);
		
		CustomItemData electromagnet = CustomItemData.builder()
                .name("electromagnet")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200305).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", electromagnet);
		
		CustomItemData electric_motor = CustomItemData.builder()
                .name("electric_motor")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200306).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", electric_motor);
		
		CustomItemData heating_coil = CustomItemData.builder()
                .name("heating_coil")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200307).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", heating_coil);
		
		CustomItemData cooling_unit = CustomItemData.builder()
                .name("cooling_unit")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200334).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", cooling_unit);
		
		CustomItemData cooler = CustomItemData.builder()
                .name("cooler")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200335).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", cooler);
		
		CustomItemData duct_tape = CustomItemData.builder()
                .name("duct_tape")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200340).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", duct_tape);
		
		CustomItemData android_memory_core = CustomItemData.builder()
                .name("android_memory_core")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200386).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", android_memory_core);
		
        CustomItemData bucket_of_oil = CustomItemData.builder()
                .name("bucket_of_oil")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200454).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", bucket_of_oil);
		
		CustomItemData bucket_of_fuel = CustomItemData.builder()
                .name("bucket_of_fuel")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200455).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", bucket_of_fuel);
		
		CustomItemData nether_ice = CustomItemData.builder()
                .name("nether_ice")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200456).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", nether_ice);
		
		CustomItemData enriched_nether_ice = CustomItemData.builder()
                .name("enriched_nether_ice")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200469).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", enriched_nether_ice);
		
		CustomItemData organic_food_wheat = CustomItemData.builder()
                .name("organic_food_wheat")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200473).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_wheat);
		
		CustomItemData organic_food_carrtos = CustomItemData.builder()
                .name("organic_food_carrtos")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200474).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_carrtos);
		
		CustomItemData organic_food_potato = CustomItemData.builder()
                .name("organic_food_potato")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200475).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_potato);
		
		CustomItemData organic_food_seeds = CustomItemData.builder()
                .name("organic_food_seeds")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200476).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_seeds);
		
		CustomItemData organic_food_beetroot = CustomItemData.builder()
                .name("organic_food_beetroot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200477).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_beetroot);
		
		CustomItemData organic_food_melon = CustomItemData.builder()
                .name("organic_food_melon")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200478).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_melon);
		
		CustomItemData organic_food_apple = CustomItemData.builder()
                .name("organic_food_apple")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200479).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_apple);
		
		CustomItemData organic_food_sweet_berries = CustomItemData.builder()
                .name("organic_food_sweet_berries")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200480).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_sweet_berries);
		
		CustomItemData organic_food_dried_kelp = CustomItemData.builder()
                .name("organic_food_dried_kelp")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200481).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_dried_kelp);
		
		CustomItemData organic_food_cocoa_beans = CustomItemData.builder()
                .name("organic_food_cocoa_beans")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200482).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_food_cocoa_beans);
		
		CustomItemData organic_fertilizer_wheat = CustomItemData.builder()
                .name("organic_fertilizer_wheat")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200489).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_wheat);
		
		CustomItemData organic_fertilizer_carrots = CustomItemData.builder()
                .name("organic_fertilizer_carrots")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200490).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_carrots);
		
		CustomItemData organic_fertilizer_potato = CustomItemData.builder()
                .name("organic_fertilizer_potato")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200491).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_potato);
		
		CustomItemData organic_fertilizer_seeds = CustomItemData.builder()
                .name("organic_fertilizer_seeds")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200492).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_seeds);
		
		CustomItemData organic_fertilizer_beetroot = CustomItemData.builder()
                .name("organic_fertilizer_beetroot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200493).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_beetroot);
		
		CustomItemData organic_fertilizer_melon = CustomItemData.builder()
                .name("organic_fertilizer_melon")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200494).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_melon);
		
		CustomItemData organic_fertilizer_apple = CustomItemData.builder()
                .name("organic_fertilizer_apple")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200495).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_apple);
		
		CustomItemData organic_fertilizer_sweet_berries = CustomItemData.builder()
                .name("organic_fertilizer_sweet_berries")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200496).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_sweet_berries);
		
		CustomItemData organic_fertilizer_dried_kelp = CustomItemData.builder()
                .name("organic_fertilizer_dried_kelp")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200497).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_dried_kelp);
		
		CustomItemData organic_fertilizer_cocoa_beans = CustomItemData.builder()
                .name("organic_fertilizer_cocoa_beans")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200498).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", organic_fertilizer_cocoa_beans);
		
		CustomItemData reactor_coolant_cell = CustomItemData.builder()
                .name("reactor_coolant_cell")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200503).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", reactor_coolant_cell);
		
		CustomItemData nether_ice_coolant_cell = CustomItemData.builder()
                .name("nether_ice_coolant_cell")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200504).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", nether_ice_coolant_cell);
		
		CustomItemData neptunium = CustomItemData.builder()
                .name("neptunium")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200505).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", neptunium);
		
		CustomItemData plutonium = CustomItemData.builder()
                .name("plutonium")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200506).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", plutonium);
		
		CustomItemData boosted_uranium = CustomItemData.builder()
                .name("boosted_uranium")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200507).build())
                .textureSize(32)
                .build();
        event.register("minecraft:player_head", boosted_uranium);

                CustomItemData tape_measure = CustomItemData.builder()
                .name("tape_measure")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200527).build())
                .textureSize(16)
                .build();
        event.register("minecraft:player_head", tape_measure);

        //
		// PAPER
		//
		
		CustomItemData magical_book_cover = CustomItemData.builder()
                .name("magical_book_cover")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200049).build())
                .textureSize(16)
                .build();
        event.register("minecraft:paper", magical_book_cover);
		
		CustomItemData steel_plate = CustomItemData.builder()
                .name("steel_plate")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200115).build())
                .textureSize(16)
                .build();
        event.register("minecraft:paper", steel_plate);
		
		CustomItemData reinforced_cloth = CustomItemData.builder()
                .name("reinforced_cloth")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200206).build())
                .textureSize(16)
                .build();
        event.register("minecraft:paper", reinforced_cloth);
		
		CustomItemData cloth = CustomItemData.builder()
                .name("cloth")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200222).build())
                .textureSize(16)
                .build();
        event.register("minecraft:paper", cloth);
		
		CustomItemData rag = CustomItemData.builder()
                .name("rag")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200223).build())
                .textureSize(16)
                .build();
        event.register("minecraft:paper", rag);
		
		CustomItemData bandage = CustomItemData.builder()
                .name("bandage")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200224).build())
                .textureSize(16)
                .build();
        event.register("minecraft:paper", bandage);
		
		CustomItemData scroll_of_dimensional_teleposition = CustomItemData.builder()
                .name("scroll_of_dimensional_teleposition")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200310).build())
                .textureSize(16)
                .build();
        event.register("minecraft:paper", scroll_of_dimensional_teleposition);
		
		CustomItemData reinforced_plate = CustomItemData.builder()
                .name("reinforced_plate")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200332).build())
                .textureSize(16)
                .build();
        event.register("minecraft:paper", reinforced_plate);
		
		CustomItemData plastic_sheet = CustomItemData.builder()
                .name("plastic_sheet")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200385).build())
                .textureSize(16)
                .build();
        event.register("minecraft:paper", plastic_sheet);
				
        //
		// ENCHANTED_BOOK
		//
		
		CustomItemData slimefun_guide = CustomItemData.builder()
                .name("slimefun_guide")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200001).build())
                .textureSize(16)
                .build();
        event.register("minecraft:enchanted_book", slimefun_guide);
		
		CustomItemData back = CustomItemData.builder()
                .name("back")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200003).build())
                .textureSize(16)
                .build();
        event.register("minecraft:enchanted_book", back);
		
		CustomItemData tome_of_knowledge_sharing = CustomItemData.builder()
                .name("tome_of_knowledge_sharing")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200313).build())
                .textureSize(16)
                .build();
        event.register("minecraft:enchanted_book", tome_of_knowledge_sharing);

        //
		// ENCHANTING_TABLE
		//
		
		CustomItemData ancient_altar = CustomItemData.builder()
                .name("ancient_altar")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200338).build())
                .textureSize(16)
                .build();
        event.register("minecraft:enchanting_table", ancient_altar);

        //
		// NETHER_WART
		//
		
		CustomItemData magical_zombie_pills = CustomItemData.builder()
                .name("magical_zombie_pills")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200162).build())
                .textureSize(16)
                .build();
        event.register("minecraft:nether_wart", magical_zombie_pills);
		
		CustomItemData vitamins = CustomItemData.builder()
                .name("vitamins")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200227).build())
                .textureSize(16)
                .build();
        event.register("minecraft:nether_wart", vitamins);

        //
		// BONE_MEAL
		//
		
		CustomItemData infernal_bonemeal = CustomItemData.builder()
                .name("infernal_bonemeal")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200419).build())
                .textureSize(16)
                .build();
        event.register("minecraft:bone_meal", infernal_bonemeal);
		
        //
		// ELYTRA
		//
		
		CustomItemData infused_elytra = CustomItemData.builder()
                .name("infused_elytra")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200422).build())
                .textureSize(16)
                .build();
        event.register("minecraft:elytra", infused_elytra);
		
		CustomItemData soulbound_elytra = CustomItemData.builder()
                .name("soulbound_elytra")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200423).build())
                .textureSize(16)
                .build();
        event.register("minecraft:elytra", soulbound_elytra);
		
        //
		// FEATHER
		//
		
		CustomItemData elytra_scale = CustomItemData.builder()
                .name("elytra_scale")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200420).build())
                .textureSize(16)
                .build();
        event.register("minecraft:feather", elytra_scale);
		
        //
		// POTION
		//
		
		CustomItemData medicine = CustomItemData.builder()
                .name("medicine")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200228).build())
                .textureSize(16)
                .build();
        event.register("minecraft:potion", medicine);
		
		CustomItemData apple_juice = CustomItemData.builder()
                .name("apple_juice")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200284).build())
                .textureSize(32)
                .build();
        event.register("minecraft:potion", apple_juice);
		
		CustomItemData carrot_juice = CustomItemData.builder()
                .name("carrot_juice")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200285).build())
                .textureSize(32)
                .build();
        event.register("minecraft:potion", carrot_juice);
		
		CustomItemData melon_juice = CustomItemData.builder()
                .name("melon_juice")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200286).build())
                .textureSize(32)
                .build();
        event.register("minecraft:potion", melon_juice);
		
		CustomItemData pumpkin_juice = CustomItemData.builder()
                .name("pumpkin_juice")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200287).build())
                .textureSize(32)
                .build();
        event.register("minecraft:potion", pumpkin_juice);
		
		CustomItemData sweet_berry_juice = CustomItemData.builder()
                .name("sweet_berry_juice")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200288).build())
                .textureSize(32)
                .build();
        event.register("minecraft:potion", sweet_berry_juice);
		
		CustomItemData golden_apple_juice = CustomItemData.builder()
                .name("golden_apple_juice")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200289).build())
                .textureSize(32)
                .build();
        event.register("minecraft:potion", golden_apple_juice);
		
		//
		// CHEST
		//
		
		CustomItemData output_chest = CustomItemData.builder()
                .name("output_chest")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200016).build())
                .textureSize(32)
                .build();
        event.register("minecraft:chest", output_chest);

        //
		// COMPARATOR
		//
		
		CustomItemData menu = CustomItemData.builder()
                .name("menu")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200004).build())
                .textureSize(16)
                .build();
        event.register("minecraft:comparator", menu);

        //
		// HOPPER
		//
		
		CustomItemData infused_hopper = CustomItemData.builder()
                .name("infused_hopper")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200465).build())
                .textureSize(16)
                .build();
        event.register("minecraft:hopper", infused_hopper);

        //
		// CRAFTING_TABLE
		//
		
		CustomItemData enhanced_crafting_table = CustomItemData.builder()
                .name("enhanced_crafting_table")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200017).build())
                .textureSize(32)
                .build();
        event.register("minecraft:crafting_table", enhanced_crafting_table);
		
		CustomItemData magic_workbench = CustomItemData.builder()
                .name("magic_workbench")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200132).build())
                .textureSize(32)
                .build();
        event.register("minecraft:crafting_table", magic_workbench);

        //
		// DISPENSER
		//
		
		CustomItemData ore_crusher = CustomItemData.builder()
                .name("ore_crusher")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200028).build())
                .textureSize(32)
                .build();
        event.register("minecraft:dispenser", ore_crusher);
		
		CustomItemData automatic_ignition_chamber = CustomItemData.builder()
                .name("automatic_ignition_chamber")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200058).build())
                .textureSize(32)
                .build();
        event.register("minecraft:dispenser", automatic_ignition_chamber);
		
		CustomItemData block_placer = CustomItemData.builder()
                .name("block_placer")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200309).build())
                .textureSize(32)
                .build();
        event.register("minecraft:dispenser", block_placer);
		
		CustomItemData ancient_pedestal = CustomItemData.builder()
                .name("ancient_pedestal")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200337).build())
                .textureSize(32)
                .build();
        event.register("minecraft:dispenser", ancient_pedestal);

		//
		// NAME_TAG
		//
		
		CustomItemData search = CustomItemData.builder()
                .name("search")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200027).build())
                .textureSize(32)
                .build();
        event.register("minecraft:anvil", search);

        //
		// ANVIL
		//
		
		CustomItemData armor_forge = CustomItemData.builder()
                .name("armor_forge")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200027).build())
                .textureSize(32)
                .build();
        event.register("minecraft:anvil", armor_forge);

        //
		// PISTON
		//
		
		CustomItemData compressor = CustomItemData.builder()
                .name("compressor")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200029).build())
                .textureSize(32)
                .build();
        event.register("minecraft:piston", compressor);

        //
		// BLAST_FURNACE
		//
		
		CustomItemData makeshift_smeltery = CustomItemData.builder()
                .name("makeshift_smeltery")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200056).build())
                .textureSize(32)
                .build();
        event.register("minecraft:blast_furnace", makeshift_smeltery);

        //
		// FURNACE
		//
		
		CustomItemData smeltery = CustomItemData.builder()
                .name("smeltery")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200057).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", smeltery);
		
		CustomItemData enhanced_furnace = CustomItemData.builder()
                .name("enhanced_furnace")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200292).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace);
		
		CustomItemData enhanced_furnace_2 = CustomItemData.builder()
                .name("enhanced_furnace_2")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200293).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_2);
		
		CustomItemData enhanced_furnace_3 = CustomItemData.builder()
                .name("enhanced_furnace_3")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200294).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_3);
		
		CustomItemData enhanced_furnace_4 = CustomItemData.builder()
                .name("enhanced_furnace_4")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200295).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_4);
		
		CustomItemData enhanced_furnace_5 = CustomItemData.builder()
                .name("enhanced_furnace_5")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200296).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_5);
		
		CustomItemData enhanced_furnace_6 = CustomItemData.builder()
                .name("enhanced_furnace_6")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200297).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_6);
		
		CustomItemData enhanced_furnace_7 = CustomItemData.builder()
                .name("enhanced_furnace_7")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200298).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_7);
		
		CustomItemData enhanced_furnace_8 = CustomItemData.builder()
                .name("enhanced_furnace_8")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200299).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_8);
		
		CustomItemData enhanced_furnace_9 = CustomItemData.builder()
                .name("enhanced_furnace_9")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200300).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_9);
		
		CustomItemData enhanced_furnace_10 = CustomItemData.builder()
                .name("enhanced_furnace_10")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200301).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_10);
		
		CustomItemData enhanced_furnace_11 = CustomItemData.builder()
                .name("enhanced_furnace_11")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200302).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", enhanced_furnace_11);
		
		CustomItemData reinforced_furnace = CustomItemData.builder()
                .name("reinforced_furnace")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200303).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", reinforced_furnace);
		
		CustomItemData carbonado_edged_furnace = CustomItemData.builder()
                .name("carbonado_edged_furnace")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200304).build())
                .textureSize(32)
                .build();
        event.register("minecraft:furnace", carbonado_edged_furnace);

        //
		// CAULDRON
		//
		
		CustomItemData ore_washer = CustomItemData.builder()
                .name("ore_washer")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200143).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cauldron", ore_washer);
		
		CustomItemData composter = CustomItemData.builder()
                .name("composter")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200239).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cauldron", composter);
		
		CustomItemData crucible = CustomItemData.builder()
                .name("crucible")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200252).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cauldron", crucible);

        //
		// STONECUTTER
		//
		
		CustomItemData table_saw = CustomItemData.builder()
                .name("table_saw")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200232).build())
                .textureSize(32)
                .build();
        event.register("minecraft:stonecutter", table_saw);

        //
		// BOWL
		//
	
                CustomItemData gold_pan = CustomItemData.builder()
                .name("gold_pan")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200053).build())
                .textureSize(32)
                .build();
        event.register("minecraft:bowl", gold_pan);
		
		CustomItemData nether_gold_pan = CustomItemData.builder()
                .name("nether_gold_pan")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200054).build())
                .textureSize(32)
                .build();
        event.register("minecraft:bowl", nether_gold_pan);

                CustomItemData automated_panning_machine = CustomItemData.builder()
                .name("automated_panning_machine")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200243).build())
                .textureSize(32)
                .build();
        event.register("minecraft:bowl", automated_panning_machine);

        //
		// GOLDEN_PICKAXE
		//
		
		CustomItemData industrial_miner = CustomItemData.builder()
                .name("industrial_miner")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200244).build())
                .textureSize(32)
                .build();
        event.register("minecraft:golden_pickaxe", industrial_miner);

        //
		// DIAMOND_PICKAXE
		//

                CustomItemData smelters_pickaxe = CustomItemData.builder()
                .name("smelters_pickaxe")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200163).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_pickaxe", smelters_pickaxe);

                CustomItemData explosive_pickaxe = CustomItemData.builder()
                .name("explosive_pickaxe")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200241).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_pickaxe", explosive_pickaxe);
		
		CustomItemData advanced_industrial_miner = CustomItemData.builder()
                .name("advanced_industrial_miner")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200245).build())
                .textureSize(32)
                .build();
        event.register("minecraft:diamond_pickaxe", advanced_industrial_miner);
		
		CustomItemData pickaxe_of_the_seeker = CustomItemData.builder()
                .name("pickaxe_of_the_seeker")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200247).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_pickaxe", pickaxe_of_the_seeker);
		
		CustomItemData pickaxe_of_vein_mining = CustomItemData.builder()
                .name("pickaxe_of_vein_mining")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200271).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_pickaxe", pickaxe_of_vein_mining);

                CustomItemData soulbound_pickaxe = CustomItemData.builder()
                .name("soulbound_pickaxe")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200275).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_pickaxe", soulbound_pickaxe);

        //
		// GLASS_BOTTLE
		//
		
		CustomItemData juicer = CustomItemData.builder()
                .name("juicer")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200283).build())
                .textureSize(32)
                .build();
        event.register("minecraft:glass_bottle", juicer);
		
		CustomItemData flask_of_knowledge = CustomItemData.builder()
                .name("flask_of_knowledge")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200314).build())
                .textureSize(16)
                .build();
        event.register("minecraft:glass_bottle", flask_of_knowledge);
		
	    //
		// LEAD
		//
		
		CustomItemData grappling_hook = CustomItemData.builder()
                .name("grappling_hook")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200131).build())
                .textureSize(32)
                .build();
        event.register("minecraft:lead", grappling_hook);
		
	    //
		// DIAMOND_AXE
		//	
		
		CustomItemData lumber_axe = CustomItemData.builder()
                .name("lumber_axe")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200197).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_axe", lumber_axe);
		
		CustomItemData soulbound_axe = CustomItemData.builder()
                .name("soulbound_axe")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200276).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_axe", soulbound_axe);

        //
		// IRON_PICKAXE
		//
		
		CustomItemData pickaxe_of_containment = CustomItemData.builder()
                .name("pickaxe_of_containment")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200230).build())
                .textureSize(16)
                .build();
        event.register("minecraft:iron_pickaxe", pickaxe_of_containment);
		
		CustomItemData hercules_pickaxe = CustomItemData.builder()
                .name("hercules_pickaxe")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200231).build())
                .textureSize(16)
                .build();
        event.register("minecraft:iron_pickaxe", hercules_pickaxe);
		
		CustomItemData cobalt_pickaxe = CustomItemData.builder()
                .name("cobalt_pickaxe")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200258).build())
                .textureSize(16)
                .build();
        event.register("minecraft:iron_pickaxe", cobalt_pickaxe);
		
		CustomItemData climbing_pick = CustomItemData.builder()
                .name("climbing_pick")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200882).build())
                .textureSize(16)
                .build();
        event.register("minecraft:iron_pickaxe", climbing_pick);

        //
		// DIAMOND_SHOVEL
		//
		
		CustomItemData explosive_shovel = CustomItemData.builder()
                .name("explosive_shovel")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200242).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_shovel", explosive_shovel);
		
		CustomItemData soulbound_shovel = CustomItemData.builder()
                .name("soulbound_shovel")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200277).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_shovel", soulbound_shovel);

        //
		// DIAMOND_HOE
		//
		
		CustomItemData soulbound_hoe = CustomItemData.builder()
                .name("soulbound_hoe")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200278).build())
                .textureSize(16)
                .build();
        event.register("minecraft:diamond_hoe", soulbound_hoe);
				
		//
		// IRON_INGOT
		//
		
        CustomItemData reinforced_alloy_ingot = CustomItemData.builder()
                .name("reinforced_alloy_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200077).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", reinforced_alloy_ingot);
		
		CustomItemData hardened_metal = CustomItemData.builder()
                .name("hardened_metal")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200078).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", hardened_metal);
		
		CustomItemData damascus_steel_ingot = CustomItemData.builder()
                .name("damascus_steel_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200079).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", damascus_steel_ingot);
		
		CustomItemData steel_ingot = CustomItemData.builder()
                .name("steel_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200080).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", steel_ingot);
		
		CustomItemData duralumin_ingot = CustomItemData.builder()
                .name("duralumin_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200082).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", duralumin_ingot);
		
		CustomItemData billon_ingot = CustomItemData.builder()
                .name("billon_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200083).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", billon_ingot);
		
		CustomItemData solder_ingot = CustomItemData.builder()
                .name("solder_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200088).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", solder_ingot);
		
		CustomItemData nickel_ingot = CustomItemData.builder()
                .name("nickel_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200092).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", nickel_ingot);
		
		CustomItemData cobalt_ingot = CustomItemData.builder()
                .name("cobalt_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200093).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", cobalt_ingot);
		
		CustomItemData ferrosilicon_ingot = CustomItemData.builder()
                .name("ferrosilicon_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200095).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", ferrosilicon_ingot);

		CustomItemData tin_ingot = CustomItemData.builder()
                .name("tin_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200106).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", tin_ingot);
		
		CustomItemData silver_ingot = CustomItemData.builder()
                .name("silver_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200107).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", silver_ingot);
		
		CustomItemData lead_ingot = CustomItemData.builder()
                .name("lead_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200108).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", lead_ingot);
		
		CustomItemData aluminum_ingot = CustomItemData.builder()
                .name("aluminum_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200109).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", aluminum_ingot);
		
		CustomItemData zinc_ingot = CustomItemData.builder()
                .name("zinc_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200110).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", zinc_ingot);
		
		CustomItemData magnesium_ingot = CustomItemData.builder()
                .name("magnesium_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200111).build())
                .textureSize(32)
                .build();
        event.register("minecraft:iron_ingot", magnesium_ingot);
		
        //
		// GOLD_INGOT
		//
		
		CustomItemData brass_ingot = CustomItemData.builder()
                .name("brass_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200084).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", brass_ingot);
		
		CustomItemData aluminum_brass_ingot = CustomItemData.builder()
                .name("aluminum_brass_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200085).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_ingot", aluminum_brass_ingot);
		
		CustomItemData aluminum_bronze_ingot = CustomItemData.builder()
                .name("aluminum_bronze_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200086).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_ingot", aluminum_bronze_ingot);
		
		CustomItemData corinthian_bronze_ingot = CustomItemData.builder()
                .name("corinthian_bronze_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200087).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_ingot", corinthian_bronze_ingot);
		
		CustomItemData gold_ingot_24k = CustomItemData.builder()
                .name("gold_ingot_24k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200144).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_24k);

        CustomItemData gold_ingot_22k = CustomItemData.builder()
                .name("gold_ingot_22k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200145).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_22k);

        CustomItemData gold_ingot_20k = CustomItemData.builder()
                .name("gold_ingot_20k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200146).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_20k);

        CustomItemData gold_ingot_18k = CustomItemData.builder()
                .name("gold_ingot_18k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200147).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_18k);

        CustomItemData gold_ingot_16k = CustomItemData.builder()
                .name("gold_ingot_16k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200148).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_16k);

        CustomItemData gold_ingot_14k = CustomItemData.builder()
                .name("gold_ingot_14k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200149).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_14k);

        CustomItemData gold_ingot_12k = CustomItemData.builder()
                .name("gold_ingot_12k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200150).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_12k);

        CustomItemData gold_ingot_10k = CustomItemData.builder()
                .name("gold_ingot_10k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200151).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_10k);

        CustomItemData gold_ingot_8k = CustomItemData.builder()
                .name("gold_ingot_8k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200152).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_8k);

        CustomItemData gold_ingot_6k = CustomItemData.builder()
                .name("gold_ingot_6k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200153).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_6k);

        CustomItemData gold_ingot_4k = CustomItemData.builder()
                .name("gold_ingot_4k")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200154).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", gold_ingot_4k);
		
		CustomItemData gilded_iron = CustomItemData.builder()
                .name("gilded_iron")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200187).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_ingot", gilded_iron);
		
		CustomItemData blistering_ingot_33 = CustomItemData.builder()
                .name("blistering_ingot_33")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200466).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", blistering_ingot_33);
		
		CustomItemData blistering_ingot_66 = CustomItemData.builder()
                .name("blistering_ingot_66")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200467).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", blistering_ingot_66);
		
		CustomItemData blistering_ingot_100 = CustomItemData.builder()
                .name("blistering_ingot_100")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200468).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gold_ingot", blistering_ingot_100);

        //
		// BRICK
		//
		
		CustomItemData bronze_ingot = CustomItemData.builder()
                .name("bronze_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200081).build())
                .textureSize(16)
                .build();
        event.register("minecraft:brick", bronze_ingot);

        CustomItemData copper_ingot = CustomItemData.builder()
                .name("copper_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200105).build())
                .textureSize(32)
                .build();
        event.register("minecraft:brick", copper_ingot);
		
		CustomItemData redstone_alloy_ingot = CustomItemData.builder()
                .name("redstone_alloy_ingot")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200217).build())
                .textureSize(16)
                .build();
        event.register("minecraft:brick", redstone_alloy_ingot);

        //
		// DIAMOND
		//
		
		CustomItemData synthetic_diamond = CustomItemData.builder()
                .name("synthetic_diamond")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200090).build())
                .textureSize(32)
                .build();
        event.register("minecraft:diamond", synthetic_diamond);

        //
		// FIREWORK_STAR
		//
		
		CustomItemData silicon = CustomItemData.builder()
                .name("silicon")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200156).build())
                .textureSize(32)
                .build();
        event.register("minecraft:firework_star", silicon);
		
		CustomItemData blank_rune = CustomItemData.builder()
                .name("blank_rune")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200409).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", blank_rune);
		
		CustomItemData ancient_rune_air = CustomItemData.builder()
                .name("ancient_rune_air")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200410).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_air);
		
		CustomItemData ancient_rune_earth = CustomItemData.builder()
                .name("ancient_rune_earth")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200411).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_earth);
		
		CustomItemData ancient_rune_fire = CustomItemData.builder()
                .name("ancient_rune_fire")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200412).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_fire);
		
		CustomItemData ancient_rune_water = CustomItemData.builder()
                .name("ancient_rune_water")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200413).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_water);
		
		CustomItemData ancient_rune_ender = CustomItemData.builder()
                .name("ancient_rune_ender")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200414).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_ender);
		
		CustomItemData ancient_rune_lightning = CustomItemData.builder()
                .name("ancient_rune_lightning")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200415).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_lightning);
		
		CustomItemData ancient_rune_rainbow = CustomItemData.builder()
                .name("ancient_rune_rainbow")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200416).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_rainbow);
		
		CustomItemData ancient_rune_soulbound = CustomItemData.builder()
                .name("ancient_rune_soulbound")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200417).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_soulbound);
		
		CustomItemData ancient_rune_enchantment = CustomItemData.builder()
                .name("ancient_rune_enchantment")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200418).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_enchantment);
		
		CustomItemData ancient_rune_villagers = CustomItemData.builder()
                .name("ancient_rune_villagers")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200543).build())
                .textureSize(16)
                .build();
        event.register("minecraft:firework_star", ancient_rune_villagers);
		
        //
		// EMERALD
		//
		
		CustomItemData common_talisman = CustomItemData.builder()
                .name("common_talisman")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200164).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", common_talisman);
		
		CustomItemData talisman_of_the_anvil = CustomItemData.builder()
                .name("talisman_of_the_anvil")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200165).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_anvil);
		
		CustomItemData ender_talisman_of_the_anvil = CustomItemData.builder()
                .name("ender_talisman_of_the_anvil")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200166).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_anvil);
		
		CustomItemData talisman_of_the_miner = CustomItemData.builder()
                .name("talisman_of_the_miner")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200167).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_miner);
		
		CustomItemData ender_talisman_of_the_miner = CustomItemData.builder()
                .name("ender_talisman_of_the_miner")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200168).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_miner);		
				
		CustomItemData talisman_of_the_hunter = CustomItemData.builder()
                .name("talisman_of_the_hunter")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200169).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_hunter);
		
		CustomItemData ender_talisman_of_the_hunter = CustomItemData.builder()
                .name("ender_talisman_of_the_hunter")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200170).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_hunter);
		
		CustomItemData talisman_of_the_lava_walker = CustomItemData.builder()
                .name("talisman_of_the_lava_walker")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200171).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_lava_walker);
		
		CustomItemData ender_talisman_of_the_lava_walker = CustomItemData.builder()
                .name("ender_talisman_of_the_lava_walker")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200172).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_lava_walker);		
		
		CustomItemData talisman_of_the_water_breather = CustomItemData.builder()
                .name("talisman_of_the_water_breather")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200173).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_water_breather);
		
		CustomItemData ender_talisman_of_the_water_breather = CustomItemData.builder()
                .name("ender_talisman_of_the_water_breather")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200174).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_water_breather);
		
		CustomItemData talisman_of_the_angel = CustomItemData.builder()
                .name("talisman_of_the_angel")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200175).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_angel);
		
		CustomItemData ender_talisman_of_the_angel = CustomItemData.builder()
                .name("ender_talisman_of_the_angel")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200176).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_angel);		
		
		CustomItemData talisman_of_the_firefighter = CustomItemData.builder()
                .name("talisman_of_the_firefighter")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200177).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_firefighter);
		
		CustomItemData ender_talisman_of_the_firefighter = CustomItemData.builder()
                .name("ender_talisman_of_the_firefighter")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200178).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_firefighter);
		
		CustomItemData talisman_of_the_magician = CustomItemData.builder()
                .name("talisman_of_the_magician")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200179).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_magician);
		
		CustomItemData ender_talisman_of_the_magician = CustomItemData.builder()
                .name("ender_talisman_of_the_magician")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200180).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_magician);		
		
		CustomItemData talisman_of_the_traveller = CustomItemData.builder()
                .name("talisman_of_the_traveller")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200181).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_traveller);
		
		CustomItemData ender_talisman_of_the_traveller = CustomItemData.builder()
                .name("ender_talisman_of_the_traveller")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200182).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_traveller);
		
		CustomItemData warrior_talisman = CustomItemData.builder()
                .name("warrior_talisman")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200183).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", warrior_talisman);
		
		CustomItemData ender_warrior_talisman = CustomItemData.builder()
                .name("ender_warrior_talisman")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200184).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_warrior_talisman);		
		
		CustomItemData talisman_of_the_knight = CustomItemData.builder()
                .name("talisman_of_the_knight")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200185).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_knight);
		
		CustomItemData ender_talisman_of_the_knight = CustomItemData.builder()
                .name("ender_talisman_of_the_knight")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200186).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_knight);
		
		CustomItemData synthetic_emerald = CustomItemData.builder()
                .name("synthetic_emerald")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200188).build())
                .textureSize(32)
                .build();
        event.register("minecraft:emerald", synthetic_emerald);
		
		CustomItemData talisman_of_the_whirlwind = CustomItemData.builder()
                .name("talisman_of_the_whirlwind")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200193).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_whirlwind);
		
		CustomItemData ender_talisman_of_the_whirlwind = CustomItemData.builder()
                .name("ender_talisman_of_the_whirlwind")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200194).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_whirlwind);		
		
		CustomItemData talisman_of_the_wizard = CustomItemData.builder()
                .name("talisman_of_the_wizard")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200195).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_wizard);
		
		CustomItemData ender_talisman_of_the_wizard = CustomItemData.builder()
                .name("ender_talisman_of_the_wizard")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200196).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_wizard);		
		
		CustomItemData talisman_of_the_caveman = CustomItemData.builder()
                .name("talisman_of_the_caveman")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200529).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_caveman);
		
		CustomItemData ender_talisman_of_the_caveman = CustomItemData.builder()
                .name("ender_talisman_of_the_caveman")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200530).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_caveman);
		
		CustomItemData talisman_of_the_wise = CustomItemData.builder()
                .name("talisman_of_the_wise")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200531).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_wise);
		
		CustomItemData ender_talisman_of_the_wise = CustomItemData.builder()
                .name("ender_talisman_of_the_wise")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200532).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_wise);		
		
		CustomItemData ender_talisman = CustomItemData.builder()
                .name("ender_talisman")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200533).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman);
		
		CustomItemData talisman_of_the_farmer = CustomItemData.builder()
                .name("talisman_of_the_farmer")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200545).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", talisman_of_the_farmer);
		
		CustomItemData ender_talisman_of_the_farmer = CustomItemData.builder()
                .name("ender_talisman_of_the_farmer")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200546).build())
                .textureSize(16)
                .build();
        event.register("minecraft:emerald", ender_talisman_of_the_farmer);	
		
		

        //
		// GUNPOWDER
		//
		
		CustomItemData shifted_ore = CustomItemData.builder()
                .name("shifted_ore")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200055).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gunpowder", shifted_ore);
		
		CustomItemData iron_dust = CustomItemData.builder()
                .name("iron_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200096).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gunpowder", iron_dust);
		
		
		CustomItemData lead_dust = CustomItemData.builder()
                .name("lead_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200100).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gunpowder", lead_dust);
		
		CustomItemData zinc_dust = CustomItemData.builder()
                .name("zinc_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200103).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gunpowder", zinc_dust);
		
		CustomItemData crushed_ore = CustomItemData.builder()
                .name("crushed_ore")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200211).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gunpowder", crushed_ore);
		
		CustomItemData pulverized_ore = CustomItemData.builder()
                .name("pulverized_ore")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200212).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gunpowder", pulverized_ore);
		
		CustomItemData pure_ore_cluster = CustomItemData.builder()
                .name("pure_ore_cluster")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200213).build())
                .textureSize(32)
                .build();
        event.register("minecraft:gunpowder", pure_ore_cluster);
		
		
		CustomItemData essence_of_afterlife = CustomItemData.builder()
                .name("essence_of_afterlife")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200260).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gunpowder", essence_of_afterlife);

        //
		// GLOWSTONE_DUST
		//
		
        CustomItemData gold_dust = CustomItemData.builder()
                .name("gold_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200097).build())
                .textureSize(32)
                .build();
        event.register("minecraft:glowstone_dust", gold_dust);

		CustomItemData copper_dust = CustomItemData.builder()
                .name("copper_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200098).build())
                .textureSize(32)
                .build();
        event.register("minecraft:glowstone_dust", copper_dust);
		
		CustomItemData sulfate = CustomItemData.builder()
                .name("sulfate")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200112).build())
                .textureSize(32)
                .build();
        event.register("minecraft:glowstone_dust", sulfate);

        //
		// SUGAR
		//
		
        CustomItemData magic_sugar = CustomItemData.builder()
                .name("magic_sugar")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200042).build())
                .textureSize(32)
                .build();
        event.register("minecraft:sugar", magic_sugar);
		
		CustomItemData tin_dust = CustomItemData.builder()
                .name("tin_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200099).build())
                .textureSize(32)
                .build();
        event.register("minecraft:sugar", tin_dust);
		
        CustomItemData silver_dust = CustomItemData.builder()
                .name("silver_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200101).build())
                .textureSize(32)
                .build();
        event.register("minecraft:sugar", silver_dust);

		CustomItemData aluminum_dust = CustomItemData.builder()
                .name("aluminum_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200102).build())
                .textureSize(32)
                .build();
        event.register("minecraft:sugar", aluminum_dust);
		
		CustomItemData zinc_dust = CustomItemData.builder()
                .name("zinc_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200103).build())
                .textureSize(32)
                .build();
        event.register("minecraft:sugar", zinc_dust);
		
		CustomItemData magnesium_dust = CustomItemData.builder()
                .name("magnesium_dust")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200104).build())
                .textureSize(32)
                .build();
        event.register("minecraft:sugar", magnesium_dust);
		
		CustomItemData wheat_flour = CustomItemData.builder()
                .name("wheat_flour")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200114).build())
                .textureSize(32)
                .build();
        event.register("minecraft:sugar", wheat_flour);
		
		CustomItemData salt = CustomItemData.builder()
                .name("salt")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200198).build())
                .textureSize(32)
                .build();
        event.register("minecraft:sugar", salt);
				
		CustomItemData magnesium_salt = CustomItemData.builder()
                .name("magnesium_salt")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200378).build())
                .textureSize(32)
                .build();
        event.register("minecraft:sugar", magnesium_salt);
		
		//
        // COOKIE
        //
		
		CustomItemData fortune_cookie = CustomItemData.builder()
                .name("fortune_cookie")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200014).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cookie", fortune_cookie);
		
		CustomItemData diet_cookie = CustomItemData.builder()
                .name("diet_cookie")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200015).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cookie", diet_cookie);
		
		CustomItemData kelp_cookie = CustomItemData.builder()
                .name("kelp_cookie")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200025).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cookie", kelp_cookie);
		
		//
        // COOKED_BEEF
        //
		
		CustomItemData beef_jerky = CustomItemData.builder()
                .name("beef_jerky")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200019).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cooked_beef", beef_jerky);
		
		//
        // COOKED_PORKCHOP
        //
		
		CustomItemData pork_jerky = CustomItemData.builder()
                .name("pork_jerky")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200020).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cooked_porkchop", pork_jerky);
		
		//
        // COOKED_CHICKEN
        //
		
		CustomItemData chicken_jerky = CustomItemData.builder()
                .name("chicken_jerky")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200021).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cooked_chicken", chicken_jerky);
		
		//
        // COOKED_MUTTON
        //
		
		CustomItemData mutton_jerky = CustomItemData.builder()
                .name("mutton_jerky")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200022).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cooked_mutton", mutton_jerky);
		
		//
        // COOKED_RABBIT
        //
		
		CustomItemData rabbit_jerky = CustomItemData.builder()
                .name("rabbit_jerky")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200023).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cooked_rabbit", rabbit_jerky);
		
		//
        // COOKED_COD
        //
		
		CustomItemData fish_jerky = CustomItemData.builder()
                .name("fish_jerky")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200024).build())
                .textureSize(32)
                .build();
        event.register("minecraft:cooked_cod", fish_jerky);
		
		//
        // ROTTEN_FLESH
        //
		
		CustomItemData monster_jerky = CustomItemData.builder()
                .name("monster_jerky")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200043).build())
                .textureSize(32)
                .build();
        event.register("minecraft:rotten_flesh", monster_jerky);
		
		//
        // GOLD_NUGGET
        //
		
		CustomItemData magical_lump_1 = CustomItemData.builder()
                .name("magical_lump_1")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200030).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_nugget", magical_lump_1);
		
		CustomItemData magical_lump_2 = CustomItemData.builder()
                .name("magical_lump_2")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200031).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_nugget", magical_lump_2);
		
		CustomItemData magical_lump_3 = CustomItemData.builder()
                .name("magical_lump_3")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200032).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_nugget", magical_lump_3);
		
		CustomItemData ender_lump_1 = CustomItemData.builder()
                .name("ender_lump_1")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200033).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_nugget", ender_lump_1);
		
		CustomItemData ender_lump_2 = CustomItemData.builder()
                .name("ender_lump_2")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200034).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_nugget", ender_lump_2);
		
		CustomItemData ender_lump_3 = CustomItemData.builder()
                .name("ender_lump_3")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200035).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gold_nugget", ender_lump_3);
		
		//
        // GLASS_PANE
        //
		
		CustomItemData magical_glass = CustomItemData.builder()
                .name("magical_glass")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200050).build())
                .textureSize(16)
                .build();
        event.register("minecraft:glass_pane", magical_glass);
		
		//
        // SHULKER_SHELL
        //
		
		CustomItemData synthetic_shulker_shell = CustomItemData.builder()
                .name("synthetic_shulker_shell")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200544).build())
                .textureSize(16)
                .build();
        event.register("minecraft:shulker_shell", synthetic_shulker_shell);
		
		//
        // PURPLE_DYE
        //
		
		CustomItemData strange_nether_goo = CustomItemData.builder()
                .name("strange_nether_goo")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200534).build())
                .textureSize(16)
                .build();
        event.register("minecraft:purple_dye", strange_nether_goo);
		
		//
        // ACTIVATOR_RAIL
        //
		
		CustomItemData basic_circuit_board = CustomItemData.builder()
                .name("basic_circuit_board")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200051).build())
                .textureSize(16)
                .build();
        event.register("minecraft:activator_rail", basic_circuit_board);
		
		//
        // POWERED_RAIL
        //
		
		CustomItemData advanced_circuit_board = CustomItemData.builder()
                .name("advanced_circuit_board")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200052).build())
                .textureSize(16)
                .build();
        event.register("minecraft:powered_rail", advanced_circuit_board);
		
		//
        // BUCKET
        //
		
		CustomItemData steel_thruster = CustomItemData.builder()
                .name("steel_thruster")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200118).build())
                .textureSize(16)
                .build();
        event.register("minecraft:bucket", steel_thruster);
		
		//
        // STRING
        //
		
		CustomItemData chain = CustomItemData.builder()
                .name("chain")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200129).build())
                .textureSize(16)
                .build();
        event.register("minecraft:string", chain);
		
		CustomItemData copper_wire = CustomItemData.builder()
                .name("copper_wire")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200308).build())
                .textureSize(16)
                .build();
        event.register("minecraft:string", copper_wire);
		
		//
        // OBSIDIAN
        //
		
		CustomItemData wither_proof_obsidian = CustomItemData.builder()
                .name("wither_proof_obsidian")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200336).build())
                .textureSize(16)
                .build();
        event.register("minecraft:obsidian", wither_proof_obsidian);
		
		//
        // BOW
        //
		
		CustomItemData soulbound_bow = CustomItemData.builder()
                .name("soulbound_bow")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200274).build())
                .textureSize(16)
                .build();
        event.register("minecraft:bow", soulbound_bow);
		
		CustomItemData explosive_bow = CustomItemData.builder()
                .name("explosive_bow")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200311).build())
                .textureSize(16)
                .build();
        event.register("minecraft:bow", explosive_bow);
		
		CustomItemData icy_bow = CustomItemData.builder()
                .name("icy_bow")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200312).build())
                .textureSize(16)
                .build();
        event.register("minecraft:bow", icy_bow);
		
		//
        // GLASS
        //
		
		CustomItemData pressure_chamber = CustomItemData.builder()
                .name("pressure_chamber")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200059).build())
                .textureSize(32)
                .build();
        event.register("minecraft:glass", pressure_chamber);
		
		//
        // GLASS
        //
		
		CustomItemData hook = CustomItemData.builder()
                .name("hook")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200130).build())
                .textureSize(16)
                .build();
        event.register("minecraft:glass", hook);
		
		//
        // SNOWBALL
        //
		
		CustomItemData heavy_cream = CustomItemData.builder()
                .name("heavy_cream")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200199).build())
                .textureSize(32)
                .build();
        event.register("minecraft:snowball", heavy_cream);
		
		//
        // ENDER_EYE
        //
		
		CustomItemData magic_eye_of_ender = CustomItemData.builder()
                .name("magic_eye_of_ender")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200041).build())
                .textureSize(16)
                .build();
        event.register("minecraft:ender_eye", magic_eye_of_ender);
		
		//
        // LIME_STAINED_GLASS_PANE
        //
		
		CustomItemData previous_on = CustomItemData.builder()
                .name("previous_on")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200007).build())
                .textureSize(16)
                .build();
        event.register("minecraft:lime_stained_glass_pane", previous_on);
		
		CustomItemData next_on = CustomItemData.builder()
                .name("next_on")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200002).build())
                .textureSize(16)
                .build();
        event.register("minecraft:lime_stained_glass_pane", next_on);
		
		//
		// GRAY_STAINED_GLASS_PANE
        //
		
		CustomItemData ui_background_2 = CustomItemData.builder()
                .name("ui_background_2")
                .customItemOptions(CustomItemOptions.builder().customModelData(1111111).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gray_stained_glass_pane", ui_background_2);
		
		CustomItemData background = CustomItemData.builder()
                .name("background")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200002).build())
                .textureSize(16)
                .build();
        event.register("minecraft:gray_stained_glass_pane", background);
		
		//
		// BLACK_STAINED_GLASS_PANE
        //
		
		CustomItemData previous_off = CustomItemData.builder()
                .name("previous_off")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200008).build())
                .textureSize(16)
                .build();
        event.register("minecraft:black_stained_glass_pane", previous_off);
		
		CustomItemData next_off = CustomItemData.builder()
                .name("next_off")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200010).build())
                .textureSize(16)
                .build();
        event.register("minecraft:black_stained_glass_pane", next_off);
		
		//
                //
                //
		
		CustomItemData BASE = CustomItemData.builder()
                .name("BASE")
                .customItemOptions(CustomItemOptions.builder().customModelData(0000000).build())
                .textureSize(16)
                .build();
        event.register("minecraft:air", BASE);
		
		
    }
}

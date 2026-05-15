# Woof Expanded Potions
A Minecraft mod that expands the vanilla potion system with stronger, longer-lasting, and entirely new potion variants. This includes resistance and haste potions missing from the base game, combo potions, and permanent-duration utility brews.
Potions are crafted in the brewing stand using a tiered ingredient system: Dusts unlock Potent-tier upgrades, Tonics unlock Extreme-tier upgrades, and Duration Mixes extend any potion to Everlasting. Combination potions encourage mixing by offering convenience over duration at base tier, with duration bonuses kicking in at Extreme tier and beyond.

## Table of Contents
- [Dusts](#-dusts)
- [Tonics](#-tonics)
- [Tonic Mixes](#-tonic-mixes)
- [Other Ingredients](#-other-ingredients)
- [Potions](#-potions)
- [Crafting Recipes](#-crafting-recipes)

## 🌫️ Dusts
Dusts are crafted at a crafting table and added to a Full-tier potion in the brewing stand to produce the Potent variant, with higher strength and shorter duration.

| In-Game Name | Internal ID | Used To Brew |
|---|---|---|
| Dust of Vitality | `vitality_powder` | Potent Strength |
| Dust of Regeneration | `regenerative_powder` | Potent Regeneration, Potent Healing |
| Dust of Bulwark | `bulwark_powder` | Potent Resistance, Potent Turtle Master |
| Dust of Netherflame | `nether_fire_powder` | Long Lasting Fire Resistance |
| Dust of Flickering | `flicker_powder` | Potent Swiftness, Potent Leaping |
| Dust of Mining | `mining_powder` | Potent Mining |
| Dust of Midnight | `midnight_powder` | Long Lasting Night Vision |
| Dust of Invisibility | `invisibility_powder` | Long Lasting Invisibility |
| Dust of Featherfall | `light_fall_powder` | Long Lasting Slow Falling |
| Dust of Breathing | `breathing_powder` | Long Lasting Water Breathing, Neptune's Delight |
| Dust of Corruption | `corrupted_powder` | Potent Slowness, Potent Poison, Potent Harming, Potent Wither, Long Lasting Weakness, Potent Brittle |
| Dust of the Deep | `deep_powder` | Dolphin's Grace, Neptune's Delight |

## 🧪 Tonics
Tonics are crafted from a Tonic Base combined with their matching dust. Added to a Full-tier potion in the brewing stand to produce the Extreme variant, with the highest amplifier and longer duration than Potent.

| In-Game Name | Internal ID | Used To Brew |
|---|---|---|
| Tonic Base | `base_tonic` | Crafting ingredient for all tonics |
| Vitality Tonic | `vitality_tonic` | Extreme Strength, Extreme Blitz, Extreme Berserker (via Blitz) |
| Rejuvenation Tonic | `rejuvenation_tonic` | Extreme Regeneration, Extreme Healing, Extreme Berserker, Extreme Buffer |
| Bulwark Tonic | `bulwark_tonic` | Extreme Resistance, Extreme Combat, Extreme Swift Guard, Extreme Juggernaut (via Buffer), Extreme Turtle Master |
| Netherfire Tonic | `nether_fire_tonic` | Permanent Fire Resistance |
| Velocity Tonic | `velocity_tonic` | Extreme Swiftness, Extreme Leaping, Extreme Blitz, Extreme Swift Guard, Extreme Gladiator (via Combat), Extreme Phantom |
| Torpidity Tonic | `torpidity_tonic` | Extreme Slowness, Extreme Poison, Extreme Harming, Extreme Wither, Extreme Decay, Everlasting Weakness |
| Miner's Tonic | `mining_tonic` | Extreme Mining, Extreme Spelunking |
| Midnight Tonic | `midnight_tonic` | Permanent Night Vision |
| Invisibility Tonic | `invisibility_tonic` | Permanent Invisibility, Extreme Phantom |
| Light Fall Tonic | `light_fall_tonic` | Permanent Slow Falling |
| Breathing Tonic | `breathing_tonic` | Permanent Water Breathing, Everlasting Neptune's Delight |
| Tidal Tonic | `tidal_tonic` | Permanent Dolphin's Grace, Everlasting Neptune's Delight |
| Withering Poison Tonic | `withering_poison_tonic` | Potent Decay |
| Soaring Tonic | `soaring_tonic` | Extreme Flight |
| Vitality and Torpidity Tonic | `vitality_torpidity_mix_tonic` | Bloodlust |
| Valkyrie Tonic | `valkyrie_tonic` | Potion of the Valkyrie |
| Overload Tonic | `overload_tonic` | Potion of Supreme Overload |
| Prosperity Tonic | `prosperity_tonic` | Potion of Supreme Prosperity |

## 🔀 Tonic Mixes
Combo tonics are crafted by combining two or three tonics together. They are used to produce Extreme combination potions in a single brewing step.

| In-Game Name | Internal ID | Recipe | Used To Brew |
|---|---|---|---|
| Vitality and Bulwark Tonic | `vitality_bulwark_mix_tonic` | Vitality Tonic + Bulwark Tonic | Extreme Combat |
| Flickering and Bulwark Tonic | `flicker_bulwark_mix_tonic` | Velocity Tonic + Bulwark Tonic | Extreme Swift Guard |
| Vitality and Velocity Tonic | `vitality_velocity_mix_tonic` | Vitality Tonic + Velocity Tonic | Extreme Blitz |
| Rejuvenation and Velocity Tonic | `rejuvenation_velocity_mix_tonic` | Rejuvenation Tonic + Velocity Tonic | Crafting ingredient |
| Gladiator Tonic | `gladiator_tonic` | Vitality Tonic + Bulwark Tonic + Velocity Tonic, or Vitality and Bulwark Tonic + Velocity Tonic, or Flickering and Bulwark Tonic + Vitality Tonic, or Vitality and Velocity Tonic + Bulwark Tonic | Extreme Gladiator |
| Juggernaut Tonic | `juggernaut_tonic` | Rejuvenation Tonic + Bulwark Tonic | Extreme Juggernaut |
| Berserker Tonic | `berserker_tonic` | Vitality Tonic + Velocity Tonic + Rejuvenation Tonic, or Vitality and Velocity Tonic + Rejuvenation Tonic, or Rejuvenation and Velocity Tonic + Vitality Tonic | Extreme Berserker |
| Phantom Tonic | `phantom_tonic` | Invisibility Tonic + Velocity Tonic | Extreme Phantom |
| Soaring Tonic | `soaring_tonic` | Velocity Tonic + Light Fall Tonic | Extreme Flight |
| Vitality and Torpidity Tonic | `vitality_torpidity_mix_tonic` | Vitality Tonic + Torpidity Tonic | Bloodlust |
| Valkyrie Tonic | `valkyrie_tonic` | Vitality Tonic + Midnight Tonic + Soaring Tonic, or Vitality Tonic + Midnight Tonic + Velocity Tonic + Light Fall Tonic | Potion of the Valkyrie |

## 🔧 Other Ingredients

| In-Game Name | Internal ID | Description |
|---|---|---|
| Enriched Powder | `enriched_powder` | Spelunking Potion ingredient, Alchemical Enricher ingredient |
| Alchemical Enricher | `alchemical_enricher` | Core crafting component |
| Supreme Stabilizing Enricher | `supreme_stabilizing_enricher` | Higher-tier crafting component |
| Fertile Ingredient Mix | `duration_mix` | Extends any potion to Everlasting |
| Enchanted Fertile Ingredient Mix | `ultra_duration_mix` | Enhanced duration ingredient |
| Diamond Carrot | `diamond_carrot` | Crafting ingredient |
| Encrusted Carrot | `encrusted_carrot` | Crafting ingredient |
| Filling Meal | `filling_meal` | Consumable food item |

## 🧴 Potions
All durations and levels are exact from the potion registrations.

### ⚔️ Strength

| Potion | Duration | Level |
|---|---|---|
| Full Potion of Strength | 3m | II |
| Potion of Potent Strength | 1m 30s | III |
| Potion of Extreme Strength | 4m 20s | III |
| Potion of Everlasting Strength | 30m | I |

### 💚 Regeneration

| Potion | Duration | Level |
|---|---|---|
| Full Potion of Regeneration | 40s | II |
| Potion of Potent Regeneration | 1m | III |
| Potion of Extreme Regeneration | 1m 30s | III |
| Potion of Everlasting Regeneration | 5m 20s | I |

### 🛡️ Resistance
Vanilla only offers Resistance via Turtle Master. These fill that gap.

| Potion | Duration | Level |
|---|---|---|
| Potion of Resistance | 3m | I |
| Potion of Resistance + | 8m | I |
| Potion of Resistance II | 1m 30s | II |
| Full Potion of Resistance | 3m | II |
| Potion of Potent Resistance | 1m 30s | III |
| Potion of Extreme Resistance | 4m 20s | III |
| Potion of Everlasting Resistance | 30m | I |

### 💨 Swiftness

| Potion | Duration | Level |
|---|---|---|
| Potion of Full Swiftness | 3m | II |
| Potion of Potent Swiftness | 1m 30s | IV |
| Potion of Extreme Swiftness | 4m 20s | IV |
| Potion of Everlasting Swiftness | 30m | I |

### 🐇 Leaping

| Potion | Duration | Level |
|---|---|---|
| Potion of Full Leaping | 3m | II |
| Potion of Potent Leaping | 1m 30s | III |
| Potion of Extreme Leaping | 4m 20s | III |
| Potion of Everlasting Leaping | 30m | I |

### 🐢 Slowness

| Potion | Duration | Level |
|---|---|---|
| Potion of Full Slowness | 48s | II |
| Potion of Potent Slowness | 24s | III |
| Potion of Extreme Slowness | 1m 18s | III |
| Potion of Everlasting Slowness | 10m | I |

### ☠️ Poison

| Potion | Duration | Level |
|---|---|---|
| Potion of Full Poison | 35s | II |
| Potion of Potent Poison | 18s | III |
| Potion of Extreme Poison | 53s | III |
| Potion of Everlasting Poison | 8m | I |

### ⛏️ Haste (Mining)
Vanilla has no standalone Haste potion. These fill that gap.

| Potion | Duration | Level |
|---|---|---|
| Potion of Mining | 3m | I |
| Potion of Long Mining | 8m | I |
| Potion of Strong Mining | 1m 30s | II |
| Potion of Full Mining | 3m | II |
| Potion of Potent Mining | 2m | III |
| Potion of Extreme Mining | 5m 20s | III |
| Potion of Everlasting Mining | 1h | I |

### 🌑 Night Vision

| Potion | Duration |
|---|---|
| Potion of Long Lasting Night Vision | 30m |
| Permanent Potion of Night Vision | 2h 30m |

### 👻 Invisibility

| Potion | Duration |
|---|---|
| Potion of Long Lasting Invisibility | 30m |
| Permanent Potion of Invisibility | 2h 30m |

### 🍃 Slow Falling

| Potion | Duration |
|---|---|
| Potion of Long Lasting Slow Falling | 15m |
| Permanent Potion of Slow Falling | 1h 15m |

### 🌊 Water Breathing

| Potion | Duration |
|---|---|
| Potion of Long Lasting Water Breathing | 30m |
| Permanent Potion of Water Breathing | 2h 30m |

### 🔥 Fire Resistance

| Potion | Duration |
|---|---|
| Potion of Long Lasting Fire Resistance | 30m |
| Potion of Permanent Fire Resistance | 2h 30m |

### ❤️ Healing

| Potion | Effects |
|---|---|
| Potion of Potent Healing | Instant Health III + Regeneration I (15s) |
| Potion of Extreme Healing | Instant Health IV + Regeneration II (30s) |

### 💥 Harming

| Potion | Effect |
|---|---|
| Potion of Potent Harming | Instant Damage IV |
| Potion of Extreme Harming | Instant Damage VI |

### 😴 Weakness

| Potion | Duration |
|---|---|
| Potion of Long Lasting Weakness | 15m |
| Potion of Everlasting Weakness | 1h 15m |

### 🖤 Wither

| Potion | Duration | Level |
|---|---|---|
| Potion of Wither | 25s | I |
| Potent Potion of Wither | 40s | II |
| Extreme Potion of Wither | 40s | VI |

### 🐬 Dolphin's Grace

| Potion | Duration |
|---|---|
| Potion of Dolphin's Grace | 30m |
| Permanent Potion of Dolphin's Grace | 2h 30m |

### 🌊🐬 Neptune's Delight: Dolphin's Grace + Conduit Power
Combo duration is longer than either component to reward mixing.

| Potion | Duration (each effect) |
|---|---|
| Potion of Neptune's Delight | 36m |
| Potion of Everlasting Neptune's Delight | 3h |

### ⚔️🛡️ Combat: Strength + Resistance
No Potent variant. Base duration is shorter than components the reward is convenience.

| Potion | Duration (each effect) | Level |
|---|---|---|
| Full Potion of Combat | 1m 45s | II |
| Extreme Potion of Combat | 5m | III |
| Potion of Everlasting Combat | 33m 20s | I |

### 💨🛡️ Swift Guard: Speed + Resistance

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of Swift Guard | 1m 45s | II |
| Extreme Potion of Swift Guard | 5m | III |
| Potion of Everlasting Swift Guard | 33m 20s | I |

### ⚔️💨 Blitz: Strength + Speed

| Potion | Duration (each effect) | Level |
|---|---|---|
| Full Potion of Blitz | 1m 45s | II |
| Extreme Potion of Blitz | 5m | III |
| Potion of Everlasting Blitz | 33m 20s | I |

### 🐇💨 Acrobat: Speed + Jump Boost

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of Acrobat | 3m 20s | II |
| Extreme Potion of Acrobat | 5m | III |
| Potion of Everlasting Acrobat | 33m 20s | I |

### ☠️🖤 Decay: Poison + Wither

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of Decay | 3m 20s | II |
| Potent Potion of Decay | 2m | III |
| Extreme Potion of Decay | 5m | III |
| Potion of Everlasting Decay | 33m 20s | I |

### ❤️💚 Buffer: Regeneration + Absorption

| Potion | Regeneration | Absorption |
|---|---|---|
| Potion of Buffer | II (45s) | III (3m 20s) |
| Extreme Potion of Buffer | III (1m 30s) | VII (5m) |
| Potion of Everlasting Buffer | I (6m) | II (33m 20s) |

### ⚔️💨🛡️ Gladiator: Strength + Speed + Resistance

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of the Gladiator | 1m | II |
| Potion of the Extreme Gladiator | 6m | III |
| Potion of the Everlasting Gladiator | 36m | I |

### 🛡️❤️💚 Juggernaut: Resistance + Absorption + Regeneration
Absorption and Regeneration have independent durations to allow for custom tuning.

| Potion | Resistance | Absorption | Regeneration |
|---|---|---|---|
| Potion of the Juggernaut | II (1m) | III (3m 20s) | II (50s) |
| Potion of the Extreme Juggernaut | III (6m) | VII (6m) | III (2m) |
| Potion of the Everlasting Juggernaut | I (36m) | II (36m) | I (8m) |

### ⚔️💨💚 Berserker: Strength + Speed + Regeneration

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of the Berserker | 1m | II |
| Potion of the Extreme Berserker | 6m | III |
| Potion of the Everlasting Berserker | 36m | I |

### 👻💨😴 Phantom: Invisibility + Speed + Weakness

| Potion | Duration | Invisibility | Speed | Weakness |
|---|---|---|---|---|
| Potion of the Phantom | 1m | I | II | I |
| Potion of the Extreme Phantom | 6m | I | III | II |
| Potion of the Everlasting Phantom | 36m | I | I | I |

### ⚔️🛡️💨❤️🌟 Supreme Overload: Strength + Resistance + Speed + Absorption + Saturation + Regeneration
A supreme combination potion requiring any full combat, speed or utility potion with the Overload Tonic. No Everlasting variant.

| Potion | Duration | Levels |
|---|---|---|
| Potion of Supreme Overload | Strength IV (10m), Resistance IV (10m), Speed IV (10m), Absorption VIII (10m), Saturation IV (10m), Regeneration III (2m) | IV / IV / IV / VIII / IV / III |

### ⛏️🍀🌑🌟💨🐇❤️ Supreme Prosperity: Haste + Luck + Conduit Power + Dolphin's Grace + Saturation + Speed + Jump Boost + Regeneration
A supreme combination potion requiring any full mining, speed, leaping or utility potion with the Prosperity Tonic. No Everlasting variant.

| Potion | Duration | Levels |
|---|---|---|
| Potion of Supreme Prosperity | Haste IV (10m), Luck IV (10m), Conduit Power (10m), Dolphin's Grace (10m), Saturation III (10m), Speed IV (10m), Jump Boost IV (10m), Regeneration III (2m) | IV / IV / I / I / III / IV / IV / III |

### 🛡️ Stability
Grants Knockback Resistance. Each level adds 10% resistance, so level I = 10%, level II = 20%, level III = 30%.

| Potion | Duration | Level | Knockback Resistance |
|---|---|---|---|
| Potion of Stability | 3m | I | 10% |
| Potion of Stability + | 8m | I | 10% |
| Potion of Stability II | 1m 30s | II | 20% |
| Full Potion of Stability | 3m | II | 20% |
| Potion of Potent Stability | 1m 30s | III | 30% |
| Potion of Extreme Stability | 4m 20s | III | 30% |
| Potion of Everlasting Stability | 30m | I | 10% |

### 🔦 Spelunking
Highlights all ores within a radius through walls. Radius scales with amplifier: Level I = 15 blocks, II = 30 blocks, III = 45 blocks, etc. Brewed from a Mining Potion rather than Awkward, requiring underground exploration to craft.

| Potion | Duration | Level | Radius |
|---|---|---|---|
| Potion of Spelunking | 30s | I | 15 blocks |
| Potion of Potent Spelunking | 10s | II | 30 blocks |
| Potion of Extreme Spelunking | 1m 30s | III | 45 blocks |
| Potion of Everlasting Spelunking | 30m | I | 15 blocks |

### 🪶 Flight
Grants creative-style flight. Speed scales with amplifier: level I = slow glide (0.02), level II = moderate (0.04), level III = fast (0.06). Duration is intentionally short to keep it balanced.

| Potion | Duration | Level |
|---|---|---|
| Potion of Flight | 3s | I |
| Potion of Flight + | 8s | I |
| Potion of Flight II | 2s | II |
| Full Potion of Flight | 3s | II |
| Potion of Everlasting Flight | 40s | I |
| Extreme Potion of Flight | 12s | III |

### 🌟 Valkyrie: Flight + Speed + Jump Boost + Strength
Supreme tier. No Everlasting variant.

| Potion | Duration | Levels |
|---|---|---|
| Potion of the Valkyrie | 3m | Flight IV, Speed IV, Jump Boost IV, Strength II |

### 👁️ Awareness
Applies Glowing to all nearby mobs. Each level increases the radius by 10 blocks. Mobs lose the glow within 3 seconds of leaving the radius.

| Potion | Duration | Level | Radius |
|---|---|---|---|
| Potion of Awareness | 3m | I | 10 blocks |
| Potion of Awareness + | 8m | I | 10 blocks |
| Potion of Awareness II | 1m 30s | II | 20 blocks |
| Full Potion of Awareness | 3m | II | 20 blocks |
| Potion of Potent Awareness | 1m 30s | III | 30 blocks |
| Potion of Extreme Awareness | 4m 20s | III | 30 blocks |
| Potion of Everlasting Awareness | 30m | I | 10 blocks |

### ⚔️ Vengeance
Deals Thorns-type damage back to any attacker. Each level deals 1 extra heart of damage (level I = 1 heart, level II = 2 hearts, level III = 3 hearts). Armour and Resistance reduce the reflected damage exactly as they do with vanilla Thorns.

| Potion | Duration | Level | Damage |
|---|---|---|---|
| Potion of Vengeance | 3m | I | 1 heart |
| Potion of Vengeance + | 8m | I | 1 heart |
| Potion of Vengeance II | 1m 30s | II | 2 hearts |
| Full Potion of Vengeance | 3m | II | 2 hearts |
| Potion of Potent Vengeance | 1m 30s | III | 3 hearts |
| Potion of Extreme Vengeance | 4m 20s | III | 3 hearts |
| Potion of Everlasting Vengeance | 30m | I | 1 heart |
| Potion of True Vengeance | 5s | XI | 11 hearts |

The Potion of True Vengeance also broadcasts a chat message as the player when consumed — a nod to Runescape's Vengeance spell.

### ⚔️☠️ Bloodlust: Strength + Hunger
High strength at the cost of hunger. No Everlasting variant.

| Potion | Duration | Levels |
|---|---|---|
| Potion of Bloodlust | Strength V (3m), Hunger II (5m) | V / II |

### 🔮 Brittle
Makes the afflicted entity take more damage from all sources. Works on both players and mobs. Each level adds 10% more incoming damage, applied before armour and resistance calculations.

| Potion | Duration | Level | Damage Increase |
|---|---|---|---|
| Potion of Brittle | 3m | I | 10% |
| Potion of Brittle + | 8m | I | 10% |
| Potion of Brittle II | 1m 30s | II | 20% |
| Full Potion of Brittle | 3m | II | 20% |
| Potion of Potent Brittle | 1m 30s | III | 30% |
| Potion of Extreme Brittle | 4m 20s | III | 30% |
| Potion of Everlasting Brittle | 30m | I | 10% |

### 🐢 Turtle Master (Extended)

| Potion | Duration | Slowness | Resistance |
|---|---|---|---|
| Full Potion of the Turtle Master | 25s | VI | IV |
| Potion of the Potent Turtle Master | 25s | VI | V |
| Potion of the Extreme Turtle Master | 25s | VI | VI |

## 🍺 Crafting Recipes

### Dust Recipes (Crafting Table, Shapeless)

| Dust | Ingredients |
|---|---|
| Dust of Vitality | Spore Blossom, Brain Coral, Golden Carrot, Glow Berries, Honeycomb |
| Dust of Regeneration | Tube Coral, Lily Pad, Golden Apple, Cocoa Beans, Beetroot |
| Dust of Bulwark | Pitcher Plant, Pufferfish, Shulker Shell, Turtle Egg, Iron Nugget |
| Dust of Netherflame | Shroomlight, Blaze Powder, Quartz, Magma Block, Magma Cream |
| Dust of Flickering | Chorus Flower, Ender Pearl, Horn Coral, Rabbit's Foot, Sugar |
| Dust of Mining | Hanging Roots, Coal (or Charcoal), Crying Obsidian, Cactus, Ink Sac |
| Dust of Midnight | Sculk (or Sculk Vein), Echo Shard, Brown Mushroom, Torchflower, Emerald |
| Dust of Invisibility | Ender Pearl, Phantom Membrane, Lilac, Glow Lichen, Amethyst Shard |
| Dust of Featherfall | any Leaves, Feather, Paper, End Stone, Firework Rocket |
| Dust of Breathing | Bubble Coral, Nautilus Shell, Tropical Fish, Prismarine Crystals, any Leaves |
| Dust of Corruption | Crimson Roots, Warped Roots, Soul Sand, Ink Sac, Wither Rose |
| Dust of the Deep | Heart of the Sea, Prismarine Shard, Cod, Bubble Coral Fan, Lapis Lazuli |
| Enriched Powder | Lapis Lazuli, Amethyst Shard, Redstone Dust, Glowstone Dust |

### Tonic Recipes (Crafting Table, Shapeless)
All standard tonics are crafted the same way: Tonic Base + matching Dust.

| Tonic | Ingredients |
|---|---|
| Vitality Tonic | Tonic Base + Dust of Vitality |
| Rejuvenation Tonic | Tonic Base + Dust of Regeneration |
| Bulwark Tonic | Tonic Base + Dust of Bulwark |
| Netherfire Tonic | Tonic Base + Dust of Netherflame |
| Velocity Tonic | Tonic Base + Dust of Flickering |
| Torpidity Tonic | Tonic Base + Dust of Corruption |
| Miner's Tonic | Tonic Base + Dust of Mining |
| Midnight Tonic | Tonic Base + Dust of Midnight |
| Invisibility Tonic | Tonic Base + Dust of Invisibility |
| Light Fall Tonic | Tonic Base + Dust of Featherfall |
| Breathing Tonic | Tonic Base + Dust of Breathing |
| Tidal Tonic | Tonic Base + Dust of the Deep |
| Withering Poison Tonic | Torpidity Tonic + Wither Rose |

### Tonic Mix Recipes (Crafting Table, Shapeless)

| Tonic Mix | Ingredients |
|---|---|
| Vitality and Bulwark Tonic | Vitality Tonic + Bulwark Tonic |
| Flickering and Bulwark Tonic | Velocity Tonic + Bulwark Tonic |
| Vitality and Velocity Tonic | Vitality Tonic + Velocity Tonic |
| Rejuvenation and Velocity Tonic | Rejuvenation Tonic + Velocity Tonic |
| Gladiator Tonic | Vitality Tonic + Bulwark Tonic + Velocity Tonic |
| Gladiator Tonic (alt) | Vitality and Bulwark Tonic + Velocity Tonic |
| Gladiator Tonic (alt) | Flickering and Bulwark Tonic + Vitality Tonic |
| Gladiator Tonic (alt) | Vitality and Velocity Tonic + Bulwark Tonic |
| Juggernaut Tonic | Rejuvenation Tonic + Bulwark Tonic |
| Berserker Tonic | Vitality Tonic + Velocity Tonic + Rejuvenation Tonic |
| Berserker Tonic (alt) | Vitality and Velocity Tonic + Rejuvenation Tonic |
| Berserker Tonic (alt) | Rejuvenation and Velocity Tonic + Vitality Tonic |
| Phantom Tonic | Invisibility Tonic + Velocity Tonic |
| Soaring Tonic | Velocity Tonic + Light Fall Tonic |
| Valkyrie Tonic | Vitality Tonic + Midnight Tonic + Soaring Tonic |
| Valkyrie Tonic (alt) | Vitality Tonic + Midnight Tonic + Velocity Tonic + Light Fall Tonic |

### Brewing Recipes (Brewing Stand)

#### Strength
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Strength | Glowstone / Redstone | Full Potion of Strength |
| Full Potion of Strength | Dust of Vitality | Potion of Potent Strength |
| Full Potion of Strength | Vitality Tonic | Potion of Extreme Strength |
| Full Potion of Strength | Fertile Ingredient Mix | Potion of Everlasting Strength |

#### Regeneration
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Regeneration | Glowstone / Redstone | Full Potion of Regeneration |
| Full Potion of Regeneration | Dust of Regeneration | Potion of Potent Regeneration |
| Full Potion of Regeneration | Rejuvenation Tonic | Potion of Extreme Regeneration |
| Full Potion of Regeneration | Fertile Ingredient Mix | Potion of Everlasting Regeneration |

#### Resistance
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Copper Ingot | Potion of Resistance |
| Potion of Resistance | Redstone | Potion of Resistance + |
| Potion of Resistance | Glowstone | Potion of Resistance II |
| Potion of Resistance +/II | Glowstone / Redstone | Full Potion of Resistance |
| Full Potion of Resistance | Dust of Bulwark | Potion of Potent Resistance |
| Full Potion of Resistance | Bulwark Tonic | Potion of Extreme Resistance |
| Full Potion of Resistance | Fertile Ingredient Mix | Potion of Everlasting Resistance |

#### Swiftness
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Swiftness | Glowstone / Redstone | Potion of Full Swiftness |
| Potion of Full Swiftness | Dust of Flickering | Potion of Potent Swiftness |
| Potion of Full Swiftness | Velocity Tonic | Potion of Extreme Swiftness |
| Potion of Full Swiftness | Fertile Ingredient Mix | Potion of Everlasting Swiftness |

#### Leaping
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Leaping | Glowstone / Redstone | Potion of Full Leaping |
| Potion of Full Leaping | Dust of Flickering | Potion of Potent Leaping |
| Potion of Full Leaping | Velocity Tonic | Potion of Extreme Leaping |
| Potion of Full Leaping | Fertile Ingredient Mix | Potion of Everlasting Leaping |

#### Slowness
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Slowness | Glowstone / Redstone | Potion of Full Slowness |
| Potion of Full Slowness | Dust of Corruption | Potion of Potent Slowness |
| Potion of Full Slowness | Torpidity Tonic | Potion of Extreme Slowness |
| Potion of Full Slowness | Fertile Ingredient Mix | Potion of Everlasting Slowness |

#### Poison
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Poison | Glowstone / Redstone | Potion of Full Poison |
| Potion of Full Poison | Dust of Corruption | Potion of Potent Poison |
| Potion of Full Poison | Torpidity Tonic | Potion of Extreme Poison |
| Potion of Full Poison | Fertile Ingredient Mix | Potion of Everlasting Poison |

#### Haste (Mining)
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Coal | Potion of Mining |
| Potion of Mining | Redstone | Potion of Long Mining |
| Potion of Mining | Glowstone | Potion of Strong Mining |
| Potion of Long/Strong Mining | Glowstone / Redstone | Potion of Full Mining |
| Potion of Full Mining | Dust of Mining | Potion of Potent Mining |
| Potion of Full Mining | Miner's Tonic | Potion of Extreme Mining |
| Potion of Full Mining | Fertile Ingredient Mix | Potion of Everlasting Mining |

#### Night Vision
| Input | Ingredient | Output |
|---|---|---|
| Long Night Vision | Dust of Midnight | Potion of Long Lasting Night Vision |
| Long Night Vision | Midnight Tonic | Permanent Potion of Night Vision |

#### Invisibility
| Input | Ingredient | Output |
|---|---|---|
| Long Invisibility | Dust of Invisibility | Potion of Long Lasting Invisibility |
| Long Invisibility | Invisibility Tonic | Permanent Potion of Invisibility |

#### Slow Falling
| Input | Ingredient | Output |
|---|---|---|
| Long Slow Falling | Dust of Featherfall | Potion of Long Lasting Slow Falling |
| Long Slow Falling | Light Fall Tonic | Permanent Potion of Slow Falling |

#### Water Breathing
| Input | Ingredient | Output |
|---|---|---|
| Long Water Breathing | Dust of Breathing | Potion of Long Lasting Water Breathing |
| Long Water Breathing | Breathing Tonic | Permanent Potion of Water Breathing |

#### Fire Resistance
| Input | Ingredient | Output |
|---|---|---|
| Long Fire Resistance | Dust of Netherflame | Potion of Long Lasting Fire Resistance |
| Long Fire Resistance | Netherfire Tonic | Potion of Permanent Fire Resistance |

#### Healing
| Input | Ingredient | Output |
|---|---|---|
| Strong Healing | Dust of Regeneration | Potion of Potent Healing |
| Strong Healing | Rejuvenation Tonic | Potion of Extreme Healing |

#### Harming
| Input | Ingredient | Output |
|---|---|---|
| Strong Harming | Dust of Corruption | Potion of Potent Harming |
| Strong Harming | Torpidity Tonic | Potion of Extreme Harming |

#### Weakness
| Input | Ingredient | Output |
|---|---|---|
| Long Weakness | Dust of Corruption | Potion of Long Lasting Weakness |
| Long Weakness | Torpidity Tonic | Potion of Everlasting Weakness |

#### Wither
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Wither Rose | Potion of Wither |
| Potion of Wither | Dust of Corruption | Potent Potion of Wither |
| Potion of Wither | Torpidity Tonic | Extreme Potion of Wither |

#### Dolphin's Grace
| Input | Ingredient | Output |
|---|---|---|
| Long Water Breathing | Dust of the Deep | Potion of Dolphin's Grace |
| Potion of Dolphin's Grace | Tidal Tonic | Permanent Potion of Dolphin's Grace |

#### Neptune's Delight
| Input | Ingredient | Output |
|---|---|---|
| Potion of Dolphin's Grace | Dust of Breathing | Potion of Neptune's Delight |
| Potion of Long Lasting Water Breathing | Dust of the Deep | Potion of Neptune's Delight |
| Permanent Potion of Dolphin's Grace | Breathing Tonic | Potion of Everlasting Neptune's Delight |
| Permanent Potion of Water Breathing | Tidal Tonic | Potion of Everlasting Neptune's Delight |

#### Combat
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Strength | Copper Ingot | Full Potion of Combat |
| Full Potion of Resistance | Blaze Powder | Full Potion of Combat |
| Potion of Extreme Strength | Bulwark Tonic | Extreme Potion of Combat |
| Potion of Extreme Resistance | Vitality Tonic | Extreme Potion of Combat |
| Full Potion of Combat | Vitality and Bulwark Tonic | Extreme Potion of Combat |
| Full Potion of Combat | Fertile Ingredient Mix | Potion of Everlasting Combat |

#### Swift Guard
| Input | Ingredient | Output |
|---|---|---|
| Potion of Full Swiftness | Copper Ingot | Potion of Swift Guard |
| Full Potion of Resistance | Sugar | Potion of Swift Guard |
| Potion of Extreme Swiftness | Bulwark Tonic | Extreme Potion of Swift Guard |
| Potion of Extreme Resistance | Velocity Tonic | Extreme Potion of Swift Guard |
| Potion of Swift Guard | Flickering and Bulwark Tonic | Extreme Potion of Swift Guard |
| Potion of Swift Guard | Fertile Ingredient Mix | Potion of Everlasting Swift Guard |

#### Blitz
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Strength | Sugar | Full Potion of Blitz |
| Potion of Full Swiftness | Blaze Powder | Full Potion of Blitz |
| Potion of Extreme Strength | Velocity Tonic | Extreme Potion of Blitz |
| Potion of Extreme Swiftness | Vitality Tonic | Extreme Potion of Blitz |
| Full Potion of Blitz | Vitality and Velocity Tonic | Extreme Potion of Blitz |
| Full Potion of Blitz | Fertile Ingredient Mix | Potion of Everlasting Blitz |

#### Acrobat
| Input | Ingredient | Output |
|---|---|---|
| Potion of Full Swiftness | Rabbit's Foot | Potion of Acrobat |
| Potion of Full Leaping | Sugar | Potion of Acrobat |
| Potion of Acrobat | Velocity Tonic | Extreme Potion of Acrobat |
| Potion of Acrobat | Fertile Ingredient Mix | Potion of Everlasting Acrobat |

#### Decay
| Input | Ingredient | Output |
|---|---|---|
| Potion of Full Poison | Wither Rose | Potion of Decay |
| Potion of Decay | Withering Poison Tonic | Potent Potion of Decay |
| Potion of Decay | Torpidity Tonic | Extreme Potion of Decay |
| Potion of Decay | Fertile Ingredient Mix | Potion of Everlasting Decay |

#### Buffer
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Regeneration | Golden Apple | Potion of Buffer |
| Potion of Buffer | Rejuvenation Tonic | Extreme Potion of Buffer |
| Potion of Buffer | Fertile Ingredient Mix | Potion of Everlasting Buffer |

#### Gladiator
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Combat | Sugar | Potion of the Gladiator |
| Potion of Swift Guard | Blaze Powder | Potion of the Gladiator |
| Full Potion of Blitz | Copper Ingot | Potion of the Gladiator |
| Extreme Potion of Combat | Velocity Tonic | Potion of the Extreme Gladiator |
| Extreme Potion of Swift Guard | Vitality Tonic | Potion of the Extreme Gladiator |
| Extreme Potion of Blitz | Bulwark Tonic | Potion of the Extreme Gladiator |
| Potion of the Gladiator | Gladiator Tonic | Potion of the Extreme Gladiator |
| Potion of the Gladiator | Fertile Ingredient Mix | Potion of the Everlasting Gladiator |

#### Juggernaut
| Input | Ingredient | Output |
|---|---|---|
| Potion of Buffer | Copper Ingot | Potion of the Juggernaut |
| Extreme Potion of Buffer | Bulwark Tonic | Potion of the Extreme Juggernaut |
| Potion of the Juggernaut | Juggernaut Tonic | Potion of the Extreme Juggernaut |
| Potion of the Juggernaut | Fertile Ingredient Mix | Potion of the Everlasting Juggernaut |

#### Berserker
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Blitz | Ghast Tear | Potion of the Berserker |
| Extreme Potion of Blitz | Rejuvenation Tonic | Potion of the Extreme Berserker |
| Potion of the Berserker | Berserker Tonic | Potion of the Extreme Berserker |
| Potion of the Berserker | Fertile Ingredient Mix | Potion of the Everlasting Berserker |

#### Phantom
| Input | Ingredient | Output |
|---|---|---|
| Long Invisibility | Sugar | Potion of the Phantom |
| Potion of Full Swiftness | Fermented Spider Eye | Potion of the Phantom |
| Potion of Extreme Swiftness | Invisibility Tonic | Potion of the Extreme Phantom |
| Potion of the Phantom | Phantom Tonic | Potion of the Extreme Phantom |
| Potion of the Phantom | Fertile Ingredient Mix | Potion of the Everlasting Phantom |

#### Supreme Overload
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Strength | Overload Tonic | Potion of Supreme Overload |
| Potion of Full Swiftness | Overload Tonic | Potion of Supreme Overload |
| Full Potion of Regeneration | Overload Tonic | Potion of Supreme Overload |
| Full Potion of Resistance | Overload Tonic | Potion of Supreme Overload |

#### Supreme Prosperity
| Input | Ingredient | Output |
|---|---|---|
| Potion of Full Mining | Prosperity Tonic + Tidal Tonic | Potion of Supreme Prosperity |
| Potion of Full Swiftness | Prosperity Tonic + Tidal Tonic | Potion of Supreme Prosperity |
| Potion of Full Leaping | Prosperity Tonic + Tidal Tonic | Potion of Supreme Prosperity |
| Full Potion of Regeneration | Prosperity Tonic + Tidal Tonic | Potion of Supreme Prosperity |

#### Stability
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Iron Ingot | Potion of Stability |
| Potion of Stability | Redstone | Potion of Stability + |
| Potion of Stability | Glowstone | Potion of Stability II |
| Potion of Stability +/II | Glowstone / Redstone | Full Potion of Stability |
| Full Potion of Stability | Dust of Bulwark | Potion of Potent Stability |
| Full Potion of Stability | Bulwark Tonic | Potion of Extreme Stability |
| Full Potion of Stability | Fertile Ingredient Mix | Potion of Everlasting Stability |

#### Spelunking
| Input | Ingredient | Output |
|---|---|---|
| Potion of Mining | Enriched Powder | Potion of Spelunking |
| Potion of Spelunking | Dust of Mining | Potion of Potent Spelunking |
| Potion of Spelunking | Miner's Tonic | Potion of Extreme Spelunking |
| Potion of Spelunking | Fertile Ingredient Mix | Potion of Everlasting Spelunking |

#### Flight
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Feather | Potion of Flight |
| Potion of Flight | Redstone | Potion of Flight + |
| Potion of Flight | Glowstone | Potion of Flight II |
| Potion of Flight +/II | Glowstone / Redstone | Full Potion of Flight |
| Full Potion of Flight | Fertile Ingredient Mix | Potion of Everlasting Flight |
| Full Potion of Flight | Soaring Tonic | Extreme Potion of Flight |

#### Valkyrie
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Flight | Valkyrie Tonic | Potion of the Valkyrie |

#### Awareness
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Eye of Ender | Potion of Awareness |
| Potion of Awareness | Redstone | Potion of Awareness + |
| Potion of Awareness | Glowstone | Potion of Awareness II |
| Potion of Awareness +/II | Glowstone / Redstone | Full Potion of Awareness |
| Full Potion of Awareness | Dust of Midnight | Potion of Potent Awareness |
| Full Potion of Awareness | Midnight Tonic | Potion of Extreme Awareness |
| Full Potion of Awareness | Fertile Ingredient Mix | Potion of Everlasting Awareness |

#### Vengeance
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Arrow | Potion of Vengeance |
| Potion of Vengeance | Redstone | Potion of Vengeance + |
| Potion of Vengeance | Glowstone | Potion of Vengeance II |
| Potion of Vengeance +/II | Glowstone / Redstone | Full Potion of Vengeance |
| Full Potion of Vengeance | Dust of Vitality | Potion of Potent Vengeance |
| Full Potion of Vengeance | Vitality Tonic | Potion of Extreme Vengeance |
| Full Potion of Vengeance | Fertile Ingredient Mix | Potion of Everlasting Vengeance |
| Full Potion of Vengeance | Encrusted Carrot | Potion of True Vengeance |

#### Bloodlust
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Strength | Vitality and Torpidity Tonic | Potion of Bloodlust |
| Long Weakness | Vitality and Torpidity Tonic | Potion of Bloodlust |

#### Brittle
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Glass | Potion of Brittle |
| Potion of Brittle | Redstone | Potion of Brittle + |
| Potion of Brittle | Glowstone | Potion of Brittle II |
| Potion of Brittle +/II | Glowstone / Redstone | Full Potion of Brittle |
| Full Potion of Brittle | Dust of Corruption | Potion of Potent Brittle |
| Full Potion of Brittle | Torpidity Tonic | Potion of Extreme Brittle |
| Full Potion of Brittle | Fertile Ingredient Mix | Potion of Everlasting Brittle |

#### Turtle Master
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Turtle Master | Glowstone / Redstone | Full Potion of the Turtle Master |
| Full Potion of the Turtle Master | Dust of Bulwark | Potion of the Potent Turtle Master |
| Full Potion of the Turtle Master | Bulwark Tonic | Potion of the Extreme Turtle Master |
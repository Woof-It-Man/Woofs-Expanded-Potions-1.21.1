# Woof Expanded Potions
A Minecraft mod that expands the vanilla potion system with stronger, longer-lasting, and entirely new potion variants. This includes resistance and haste potions missing from the base game, combo potions, and permanent-duration utility brews.
Potions are crafted in the brewing stand using a tiered ingredient system: Dusts unlock Potent-tier upgrades, Tonics unlock Extreme-tier upgrades, and Duration Mixes extend any potion to Ever Lasting. Combination potions encourage mixing by offering convenience over duration at base tier, with duration bonuses kicking in at Extreme tier and beyond.

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
| Dust of Corruption | `corrupted_powder` | Potent Slowness, Potent Poison, Potent Harming, Potent Wither, Long Lasting Weakness |
| Dust of the Deep | `deep_powder` | Long Lasting Dolphin's Grace, Neptune's Delight |

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
| Torpidity Tonic | `torpidity_tonic` | Extreme Slowness, Extreme Poison, Extreme Harming, Extreme Wither, Extreme Decay, Ever Lasting Weakness |
| Miner's Tonic | `mining_tonic` | Extreme Mining |
| Midnight Tonic | `midnight_tonic` | Permanent Night Vision |
| Invisibility Tonic | `invisibility_tonic` | Permanent Invisibility, Extreme Phantom |
| Light Fall Tonic | `light_fall_tonic` | Permanent Slow Falling |
| Breathing Tonic | `breathing_tonic` | Permanent Water Breathing, Ever Lasting Neptune's Delight |
| Tidal Tonic | `tidal_tonic` | Permanent Dolphin's Grace, Ever Lasting Neptune's Delight |
| Withering Poison Tonic | `withering_poison_tonic` | Potent Decay |

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

## 🔧 Other Ingredients

| In-Game Name | Internal ID | Description |
|---|---|---|
| Alchemical Enricher | `alchemical_enricher` | Core crafting component |
| Supreme Stabilizing Enricher | `supreme_stabilizing_enricher` | Higher-tier crafting component |
| Fertile Ingredient Mix | `duration_mix` | Extends any potion to Ever Lasting |
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
| Potion of Ever Lasting Strength | 30m | I |

### 💚 Regeneration

| Potion | Duration | Level |
|---|---|---|
| Full Potion of Regeneration | 40s | II |
| Potion of Potent Regeneration | 1m | III |
| Potion of Extreme Regeneration | 1m 30s | III |
| Potion of Ever Lasting Regeneration | 5m 20s | I |

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
| Potion of Ever Lasting Resistance | 30m | I |

### 💨 Swiftness

| Potion | Duration | Level |
|---|---|---|
| Potion of Full Swiftness | 3m | II |
| Potion of Potent Swiftness | 1m 30s | IV |
| Potion of Extreme Swiftness | 4m 20s | IV |
| Potion of Ever Lasting Swiftness | 30m | I |

### 🐇 Leaping

| Potion | Duration | Level |
|---|---|---|
| Potion of Full Leaping | 3m | II |
| Potion of Potent Leaping | 1m 30s | III |
| Potion of Extreme Leaping | 4m 20s | III |
| Potion of Ever Lasting Leaping | 30m | I |

### 🐢 Slowness

| Potion | Duration | Level |
|---|---|---|
| Potion of Full Slowness | 48s | II |
| Potion of Potent Slowness | 24s | III |
| Potion of Extreme Slowness | 1m 18s | III |
| Potion of Ever Lasting Slowness | 10m | I |

### ☠️ Poison

| Potion | Duration | Level |
|---|---|---|
| Potion of Full Poison | 35s | II |
| Potion of Potent Poison | 18s | III |
| Potion of Extreme Poison | 53s | III |
| Potion of Ever Lasting Poison | 8m | I |

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
| Potion of Ever Lasting Mining | 1h | I |

### 🌑 Night Vision

| Potion | Duration |
|---|---|
| Long Lasting Potion of Night Vision | 30m |
| Permanent Potion of Night Vision | 2h 30m |

### 👻 Invisibility

| Potion | Duration |
|---|---|
| Long Lasting Potion of Invisibility | 30m |
| Permanent Potion of Invisibility | 2h 30m |

### 🍃 Slow Falling

| Potion | Duration |
|---|---|
| Long Lasting Potion of Slow Falling | 15m |
| Permanent Potion of Slow Falling | 1h 15m |

### 🌊 Water Breathing

| Potion | Duration |
|---|---|
| Long Lasting Potion of Water Breathing | 30m |
| Permanent Potion of Water Breathing | 2h 30m |

### 🔥 Fire Resistance

| Potion | Duration |
|---|---|
| Potion of Long Lasting Fire Resistance | 30m |
| Potion of Permanent Fire Resistance | 2h 30m |

### ❤️ Healing

| Potion | Effects |
|---|---|
| Potent Potion of Healing | Instant Health III + Regeneration I (15s) |
| Extreme Potion of Healing | Instant Health IV + Regeneration II (30s) |

### 💥 Harming

| Potion | Effect |
|---|---|
| Potion of Potent Harming | Instant Damage IV |
| Potion of Extreme Harming | Instant Damage VI |

### 😴 Weakness

| Potion | Duration |
|---|---|
| Potion of Long Lasting Weakness | 15m |
| Potion of Ever Lasting Weakness | 1h 15m |

### 🖤 Wither

| Potion | Duration | Level |
|---|---|---|
| Potion of Wither | 25s | I |
| Potent Potion of Wither | 40s | II |
| Extreme Potion of Wither | 40s | VI |

### 🐬 Dolphin's Grace

| Potion | Duration |
|---|---|
| Potion of Dolphin's Grace | 8m |
| Long Lasting Potion of Dolphin's Grace | 30m |
| Permanent Potion of Dolphin's Grace | 2h 30m |

### 🌊🐬 Neptune's Delight, Dolphin's Grace and Conduit Power
Combo duration is longer than either component to reward mixing.

| Potion | Duration (each effect) |
|---|---|
| Potion of Neptune's Delight | 36m |
| Potion of Ever Lasting Neptune's Delight | 3h |

### ⚔️🛡️ Combat Strength + Resistance
No Potent variant. Base duration is shorter than components the reward is convenience.

| Potion | Duration (each effect) | Level |
|---|---|---|
| Full Potion of Combat | 1m 45s | II |
| Extreme Potion of Combat | 5m | III |
| Potion of Ever Lasting Combat | 33m 20s | I |

### 💨🛡️ Swift Guard Speed + Resistance

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of Swift Guard | 1m 45s | II |
| Extreme Potion of Swift Guard | 5m | III |
| Potion of Ever Lasting Swift Guard | 33m 20s | I |

### ⚔️💨 Blitz Strength + Speed

| Potion | Duration (each effect) | Level |
|---|---|---|
| Full Potion of Blitz | 1m 45s | II |
| Extreme Potion of Blitz | 5m | III |
| Potion of Ever Lasting Blitz | 33m 20s | I |

### 🐇💨 Acrobat Speed + Jump Boost

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of Acrobat | 3m 20s | II |
| Extreme Potion of Acrobat | 5m | III |
| Potion of Ever Lasting Acrobat | 33m 20s | I |

### ☠️🖤 Decay Poison + Wither

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of Decay | 3m 20s | II |
| Potent Potion of Decay | 2m | III |
| Extreme Potion of Decay | 5m | III |
| Potion of Ever Lasting Decay | 33m 20s | I |

### ❤️💚 Buffer Regeneration + Absorption

| Potion | Regeneration | Absorption |
|---|---|---|
| Potion of Buffer | II (45s) | III (3m 20s) |
| Extreme Potion of Buffer | III (1m 30s) | VII (5m) |
| Potion of Ever Lasting Buffer | I (6m) | II (33m 20s) |

### ⚔️💨🛡️ Gladiator Strength + Speed + Resistance

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of the Gladiator | 1m | II |
| Extreme Potion of the Gladiator | 6m | III |
| Potion of the Ever Lasting Gladiator | 36m | I |

### 🛡️❤️💚 Juggernaut Resistance + Absorption + Regeneration
Absorption and Regeneration have independent durations to allow for custom tuning.

| Potion | Resistance | Absorption | Regeneration |
|---|---|---|---|
| Potion of the Juggernaut | II (1m) | III (3m 20s) | II (50s) |
| Extreme Potion of the Juggernaut | III (6m) | VII (6m) | III (2m) |
| Potion of the Ever Lasting Juggernaut | I (36m) | II (36m) | I (8m) |

### ⚔️💨💚 Berserker Strength + Speed + Regeneration

| Potion | Duration (each effect) | Level |
|---|---|---|
| Potion of the Berserker | 1m | II |
| Extreme Potion of the Berserker | 6m | III |
| Potion of the Ever Lasting Berserker | 36m | I |

### 👻💨😴 Phantom Invisibility + Speed + Weakness

| Potion | Duration | Invisibility | Speed | Weakness |
|---|---|---|---|---|
| Potion of the Phantom | 1m | I | II | I |
| Extreme Potion of the Phantom | 6m | I | III | II |
| Potion of the Ever Lasting Phantom | 36m | I | I | I |

### 🐢 Turtle Master (Extended)

| Potion | Duration | Slowness | Resistance |
|---|---|---|---|
| Potion of Full the Turtle Master | 25s | VI | IV |
| Potion of Potent the Turtle Master | 25s | VI | V |
| Potion of Extreme the Turtle Master | 25s | VI | VI |

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

### Brewing Recipes (Brewing Stand)

#### Strength
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Strength | Glowstone / Redstone | Full Potion of Strength |
| Full Potion of Strength | Dust of Vitality | Potion of Potent Strength |
| Full Potion of Strength | Vitality Tonic | Potion of Extreme Strength |
| Full Potion of Strength | Fertile Ingredient Mix | Potion of Ever Lasting Strength |

#### Regeneration
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Regeneration | Glowstone / Redstone | Full Potion of Regeneration |
| Full Potion of Regeneration | Dust of Regeneration | Potion of Potent Regeneration |
| Full Potion of Regeneration | Rejuvenation Tonic | Potion of Extreme Regeneration |
| Full Potion of Regeneration | Fertile Ingredient Mix | Potion of Ever Lasting Regeneration |

#### Resistance
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Copper Ingot | Potion of Resistance |
| Potion of Resistance | Redstone | Potion of Resistance + |
| Potion of Resistance | Glowstone | Potion of Resistance II |
| Potion of Resistance +/II | Glowstone / Redstone | Full Potion of Resistance |
| Full Potion of Resistance | Dust of Bulwark | Potion of Potent Resistance |
| Full Potion of Resistance | Bulwark Tonic | Potion of Extreme Resistance |
| Full Potion of Resistance | Fertile Ingredient Mix | Potion of Ever Lasting Resistance |

#### Swiftness
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Swiftness | Glowstone / Redstone | Potion of Full Swiftness |
| Potion of Full Swiftness | Dust of Flickering | Potion of Potent Swiftness |
| Potion of Full Swiftness | Velocity Tonic | Potion of Extreme Swiftness |
| Potion of Full Swiftness | Fertile Ingredient Mix | Potion of Ever Lasting Swiftness |

#### Leaping
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Leaping | Glowstone / Redstone | Potion of Full Leaping |
| Potion of Full Leaping | Dust of Flickering | Potion of Potent Leaping |
| Potion of Full Leaping | Velocity Tonic | Potion of Extreme Leaping |
| Potion of Full Leaping | Fertile Ingredient Mix | Potion of Ever Lasting Leaping |

#### Slowness
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Slowness | Glowstone / Redstone | Potion of Full Slowness |
| Potion of Full Slowness | Dust of Corruption | Potion of Potent Slowness |
| Potion of Full Slowness | Torpidity Tonic | Potion of Extreme Slowness |
| Potion of Full Slowness | Fertile Ingredient Mix | Potion of Ever Lasting Slowness |

#### Poison
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Poison | Glowstone / Redstone | Potion of Full Poison |
| Potion of Full Poison | Dust of Corruption | Potion of Potent Poison |
| Potion of Full Poison | Torpidity Tonic | Potion of Extreme Poison |
| Potion of Full Poison | Fertile Ingredient Mix | Potion of Ever Lasting Poison |

#### Haste (Mining)
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Coal | Potion of Mining |
| Potion of Mining | Redstone | Potion of Long Mining |
| Potion of Mining | Glowstone | Potion of Strong Mining |
| Potion of Long/Strong Mining | Glowstone / Redstone | Potion of Full Mining |
| Potion of Full Mining | Dust of Mining | Potion of Potent Mining |
| Potion of Full Mining | Miner's Tonic | Potion of Extreme Mining |
| Potion of Full Mining | Fertile Ingredient Mix | Potion of Ever Lasting Mining |

#### Night Vision
| Input | Ingredient | Output |
|---|---|---|
| Long Night Vision | Dust of Midnight | Long Lasting Potion of Night Vision |
| Long Night Vision | Midnight Tonic | Permanent Potion of Night Vision |

#### Invisibility
| Input | Ingredient | Output |
|---|---|---|
| Long Invisibility | Dust of Invisibility | Long Lasting Potion of Invisibility |
| Long Invisibility | Invisibility Tonic | Permanent Potion of Invisibility |

#### Slow Falling
| Input | Ingredient | Output |
|---|---|---|
| Long Slow Falling | Dust of Featherfall | Long Lasting Potion of Slow Falling |
| Long Slow Falling | Light Fall Tonic | Permanent Potion of Slow Falling |

#### Water Breathing
| Input | Ingredient | Output |
|---|---|---|
| Long Water Breathing | Dust of Breathing | Long Lasting Potion of Water Breathing |
| Long Water Breathing | Breathing Tonic | Permanent Potion of Water Breathing |

#### Fire Resistance
| Input | Ingredient | Output |
|---|---|---|
| Long Fire Resistance | Dust of Netherflame | Potion of Long Lasting Fire Resistance |
| Long Fire Resistance | Netherfire Tonic | Potion of Permanent Fire Resistance |

#### Healing
| Input | Ingredient | Output |
|---|---|---|
| Strong Healing | Dust of Regeneration | Potent Potion of Healing |
| Strong Healing | Rejuvenation Tonic | Extreme Potion of Healing |

#### Harming
| Input | Ingredient | Output |
|---|---|---|
| Strong Harming | Dust of Corruption | Potion of Potent Harming |
| Strong Harming | Torpidity Tonic | Potion of Extreme Harming |

#### Weakness
| Input | Ingredient | Output |
|---|---|---|
| Long Weakness | Dust of Corruption | Potion of Long Lasting Weakness |
| Long Weakness | Torpidity Tonic | Potion of Ever Lasting Weakness |

#### Wither
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Wither Rose | Potion of Wither |
| Potion of Wither | Dust of Corruption | Potent Potion of Wither |
| Potion of Wither | Torpidity Tonic | Extreme Potion of Wither |

#### Dolphin's Grace
| Input | Ingredient | Output |
|---|---|---|
| Awkward Potion | Pufferfish | Potion of Dolphin's Grace |
| Potion of Dolphin's Grace | Dust of the Deep | Long Lasting Potion of Dolphin's Grace |
| Potion of Dolphin's Grace | Tidal Tonic | Permanent Potion of Dolphin's Grace |

#### Neptune's Delight
| Input | Ingredient | Output |
|---|---|---|
| Long Lasting Potion of Dolphin's Grace | Dust of Breathing | Potion of Neptune's Delight |
| Long Lasting Potion of Water Breathing | Dust of the Deep | Potion of Neptune's Delight |
| Permanent Potion of Dolphin's Grace | Breathing Tonic | Potion of Ever Lasting Neptune's Delight |
| Permanent Potion of Water Breathing | Tidal Tonic | Potion of Ever Lasting Neptune's Delight |

#### Combat
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Strength | Copper Ingot | Full Potion of Combat |
| Full Potion of Resistance | Blaze Powder | Full Potion of Combat |
| Potion of Extreme Strength | Bulwark Tonic | Extreme Potion of Combat |
| Potion of Extreme Resistance | Vitality Tonic | Extreme Potion of Combat |
| Full Potion of Combat | Vitality and Bulwark Tonic | Extreme Potion of Combat |
| Full Potion of Combat | Fertile Ingredient Mix | Potion of Ever Lasting Combat |

#### Swift Guard
| Input | Ingredient | Output |
|---|---|---|
| Potion of Full Swiftness | Copper Ingot | Potion of Swift Guard |
| Full Potion of Resistance | Sugar | Potion of Swift Guard |
| Potion of Extreme Swiftness | Bulwark Tonic | Extreme Potion of Swift Guard |
| Potion of Extreme Resistance | Velocity Tonic | Extreme Potion of Swift Guard |
| Potion of Swift Guard | Flickering and Bulwark Tonic | Extreme Potion of Swift Guard |
| Potion of Swift Guard | Fertile Ingredient Mix | Potion of Ever Lasting Swift Guard |

#### Blitz
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Strength | Sugar | Full Potion of Blitz |
| Potion of Full Swiftness | Blaze Powder | Full Potion of Blitz |
| Potion of Extreme Strength | Velocity Tonic | Extreme Potion of Blitz |
| Potion of Extreme Swiftness | Vitality Tonic | Extreme Potion of Blitz |
| Full Potion of Blitz | Vitality and Velocity Tonic | Extreme Potion of Blitz |
| Full Potion of Blitz | Fertile Ingredient Mix | Potion of Ever Lasting Blitz |

#### Acrobat
| Input | Ingredient | Output |
|---|---|---|
| Potion of Full Swiftness | Rabbit's Foot | Potion of Acrobat |
| Potion of Full Leaping | Sugar | Potion of Acrobat |
| Potion of Acrobat | Velocity Tonic | Extreme Potion of Acrobat |
| Potion of Acrobat | Fertile Ingredient Mix | Potion of Ever Lasting Acrobat |

#### Decay
| Input | Ingredient | Output |
|---|---|---|
| Potion of Full Poison | Wither Rose | Potion of Decay |
| Potion of Decay | Withering Poison Tonic | Potent Potion of Decay |
| Potion of Decay | Torpidity Tonic | Extreme Potion of Decay |
| Potion of Decay | Fertile Ingredient Mix | Potion of Ever Lasting Decay |

#### Buffer
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Regeneration | Golden Apple | Potion of Buffer |
| Potion of Buffer | Rejuvenation Tonic | Extreme Potion of Buffer |
| Potion of Buffer | Fertile Ingredient Mix | Potion of Ever Lasting Buffer |

#### Gladiator
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Combat | Sugar | Potion of the Gladiator |
| Potion of Swift Guard | Blaze Powder | Potion of the Gladiator |
| Full Potion of Blitz | Copper Ingot | Potion of the Gladiator |
| Extreme Potion of Combat | Velocity Tonic | Extreme Potion of the Gladiator |
| Extreme Potion of Swift Guard | Vitality Tonic | Extreme Potion of the Gladiator |
| Extreme Potion of Blitz | Bulwark Tonic | Extreme Potion of the Gladiator |
| Potion of the Gladiator | Gladiator Tonic | Extreme Potion of the Gladiator |
| Potion of the Gladiator | Fertile Ingredient Mix | Potion of the Ever Lasting Gladiator |

#### Juggernaut
| Input | Ingredient | Output |
|---|---|---|
| Potion of Buffer | Copper Ingot | Potion of the Juggernaut |
| Extreme Potion of Buffer | Bulwark Tonic | Extreme Potion of the Juggernaut |
| Potion of the Juggernaut | Juggernaut Tonic | Extreme Potion of the Juggernaut |
| Potion of the Juggernaut | Fertile Ingredient Mix | Potion of the Ever Lasting Juggernaut |

#### Berserker
| Input | Ingredient | Output |
|---|---|---|
| Full Potion of Blitz | Ghast Tear | Potion of the Berserker |
| Extreme Potion of Blitz | Rejuvenation Tonic | Extreme Potion of the Berserker |
| Potion of the Berserker | Berserker Tonic | Extreme Potion of the Berserker |
| Potion of the Berserker | Fertile Ingredient Mix | Potion of the Ever Lasting Berserker |

#### Phantom
| Input | Ingredient | Output |
|---|---|---|
| Long Invisibility | Sugar | Potion of the Phantom |
| Potion of Full Swiftness | Fermented Spider Eye | Potion of the Phantom |
| Potion of Extreme Swiftness | Invisibility Tonic | Extreme Potion of the Phantom |
| Potion of the Phantom | Phantom Tonic | Extreme Potion of the Phantom |
| Potion of the Phantom | Fertile Ingredient Mix | Potion of the Ever Lasting Phantom |

#### Turtle Master
| Input | Ingredient | Output |
|---|---|---|
| Long/Strong Turtle Master | Glowstone / Redstone | Potion of Full the Turtle Master |
| Potion of Full the Turtle Master | Dust of Bulwark | Potion of Potent the Turtle Master |
| Potion of Full the Turtle Master | Bulwark Tonic | Potion of Extreme the Turtle Master |
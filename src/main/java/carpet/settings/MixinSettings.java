package carpet.settings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MixinSettings {
    public boolean CommandManagerMixin = true;
    public boolean FillCommandMixin = true;
    public boolean CloneCommandMixin = true;
    public boolean SetBlockCommandMixin = true;
    public boolean ForceLoadCommand_forceLoadLimitMixin = true;
    public boolean World_fillUpdatesMixin = true;
    public boolean WorldChunk_fillUpdatesMixin = true;
    public boolean StructureBlockBlockEntity_fillUpdatesMixin = true;
    public boolean Structure_fillUpdatesMixin = true;
    public boolean ServerPlayNetworkHandler_interactionUpdatesMixin = true;
    public boolean ServerMetadata_motdMixin = true;
    public boolean MinecraftServer_coreMixin = true;
    public boolean MinecraftServer_tickspeedMixin = true;
    public boolean World_tickMixin = true;
    public boolean ServerWorld_tickMixin = true;
    public boolean ServerChunkManager_tickMixin = true;
    public boolean ThreadedAnvilChunkStorage_tickMixin = true;
    public boolean ThreadedAnvilChunkStorage_scarpetChunkCreationMixin = true;
    public boolean ChunkHolder_scarpetChunkCreationMixin = true;
    public boolean MobEntityMixin = true;
    public boolean ServerWorld_unloadedEntityMixin = true;
    public boolean EntityTrackerEntry_leashFixMixin = true;
    public boolean VillagerEntity_aiMixin = true;
    public boolean ServerWorld_fakePlayersMixin = true;
    public boolean ThrownEnderpearlEntity_fakePlayersMixin = true;
    public boolean ServerPlayNetworkHandler_coreMixin = true;
    public boolean ServerPlayNetworkHandler_tickMixin = true;
    public boolean MinecraftServer_scarpetMixin = true;
    public boolean PlayerListHeaderS2CPacketMixin = true;
    public boolean WeightedPickerEntryMixin = true;
    public boolean ExperienceOrbEntityMixin = true;
    public boolean PlayerActionC2SPacketMixin = true;
    public boolean ServerPlayerEntityMixin = true;
    public boolean PlayerManager_coreMixin = true;
    public boolean PlayerManager_fakePlayersMixin = true;
    public boolean RedstoneWireBlockMixin = true;
    public boolean CarpetBlockMixin = true;
    public boolean SummonCommandMixin = true;
    public boolean PistonHandler_pushLimitMixin = true;
    public boolean PoweredRailBlock_powerLimitMixin = true;
    public boolean LivingEntity_maxCollisionsMixin = true;
    public boolean ServerWorld_onePlayerSleepingMixin = true;
    public boolean CoralBlockMixin = true;
    public boolean CoralFeatureMixin = true;
    public boolean StructureFeatureMixin = true;
    public boolean World_scarpetPlopMixin = true;
    public boolean ServerPlayNetworkHandler_scarpetEventsMixin = true;
    public boolean ServerPlayerInteractionManager_scarpetEventsMixin = true;
    public boolean PlayerEntity_parrotMixin = true;
    public boolean SaplingBlockMixin = true;
    public boolean EntityMixin = true;
    public boolean FlatChunkGeneratorMixin = true;
    public boolean BiomeArray_getBiomeArrayMixin = true;
    public boolean GuardianEntityMixin = true;
    public boolean DesertPyramidFeatureMixin = true;
    public boolean HuskEntityMixin = true;
    public boolean OverworldChunkGeneratorMixin = true;
    public boolean ServerChunkManagerMixin = true;
    public boolean SpawnHelperMixin = true;
    public boolean DirectionMixin = true;
    public boolean ServerPlayerInteractionManager_cactusMixin = true;
    public boolean HopperBlock_cactusMixin = true;
    public boolean ItemUsageContext_cactusMixin = true;
    public boolean DispenserBlock_cactusMixin = true;
    public boolean PistonBlock_rotatorBlockMixin = true;
    public boolean ServerPlayNetworkHandler_antiCheatDisabledMixin = true;
    public boolean PlayerEntity_antiCheatDisabled = true;
    public boolean Entity_portalSuffocationMixin = true;
    public boolean PortalForcer_portalSuffocationMixin = true;
    public boolean ServerPlayerInteractionManager_antiCheatMixin = true;
    public boolean HopperBlockEntityMixin = true;
    public boolean ContainerMixin = true;
    public boolean ClientConnectionMixin = true;
    public boolean CauldronBlock_stackableSBoxesMixin = true;
    public boolean ItemEntityMixin = true;
    public boolean TntBlockMixin = true;
    public boolean ExplosionMixin = true;
    public boolean ExplosionAccessor = true;
    public boolean TntEntityMixin = true;
    public boolean ProjectileEntityMixin = true;
    public boolean FallingBlockEntityMixin = true;
    public boolean ThrownEntityMixin = true;
    public boolean EntityNavigation_pathfindingMixin = true;
    public boolean FloatingIslandsChunkGeneratorMixin = true;
    public boolean EndCityFeatureMixin = true;
    public boolean InfestedBlockMixin = true;
    public boolean PlayerEntityMixin_portalDelayMixin = true;
    public boolean PistonBlock_qcMixin = true;
    public boolean DispenserBlock_qcMixin = true;
    public boolean PickaxeItem_missingToolsMixin = true;
    public boolean ShearsItem_missingToolsMixin = true;
    public boolean ItemDispenserBehaviour_extremeBehavioursMixin = true;
    public boolean ItemScatterer_extremeMixin = true;
    public boolean FishingBobberEntity_extremeMixin = true;
    public boolean SkeletonHorseTrapTriggerGoal_extremeMixin = true;
    public boolean FireworkEntity_extremeMixin = true;
    public boolean BlazeEntity_extremeMixin = true;
    public boolean BlazeEntityShootFireballGoal_extremeMixin = true;
    public boolean MobEntity_extremeMixin = true;
    public boolean ExplosiveProjectileEntity_extremeMixin = true;
    public boolean LlamaSpitEntity_extremeMixin = true;
    public boolean ProjectileEntity_extremeMixin = true;
    public boolean ArmorStandEntity_scarpetMarkerMixin = true;
    public boolean Entity_scarpetEventsMixin = true;
    public boolean LivingEntity_scarpetEventsMixin = true;
    public boolean DamageTracker_scarpetEventMixin = true;
    public boolean ServerPlayerEntity_scarpetEventMixin = true;
    public boolean FallingBlockEntity_scarpetEventsMixin = true;
    public boolean BlockItem_scarpetEventMixin = true;
    public boolean ChunkTicketManager_scarpetMixin = true;
    public boolean ServerChunkManager_scarpetMixin = true;
    public boolean StatType_scarpetMixin = true;
    public boolean PointOfInterest_scarpetMixin = true;
    public boolean PistonBlock_movableTEMixin = true;
    public boolean PistonBlockEntity_movableTEMixin = true;
    public boolean World_movableTEMixin = true;
    public boolean WorldChunk_movableTEMixin = true;
    public boolean PistonHandler_movableTEMixin = true;

    public void load(File f) throws FileNotFoundException
    {
        String s; // 
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine())
        {
            
        }
    }
}
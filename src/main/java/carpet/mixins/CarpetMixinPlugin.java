package carpet.mixins;

import carpet.settings.MixinSettings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class CarpetMixinPlugin implements IMixinConfigPlugin {
    private static final String MIXIN_PACKAGE_ROOT = "carpet.mixins";

    private final HashSet<String> enabledPackages = new HashSet<>();

    @Override
    public void onLoad(String mixinPackage) {

        // TODO all of it

    }

    private void setupMixins() {
        // TODO the rest of it
    }

    private void enableIf(String packageName, boolean condition) {
        if (condition) {
            this.enabledPackages.add(packageName);
        }
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if (!mixinClassName.startsWith(MIXIN_PACKAGE_ROOT)) {
            return true;
        }

        int start = MIXIN_PACKAGE_ROOT.length();
        int lastSplit = start;
        int nextSplit;

        while ((nextSplit = mixinClassName.indexOf('.', lastSplit + 1)) != -1) {
            String part = mixinClassName.substring(start, nextSplit);

            if (this.enabledPackages.contains(part)) {
                return true;
            }

            lastSplit = nextSplit;
        }

        return false;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }
}
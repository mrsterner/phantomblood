package mrsterner.phantomblood.client.patricle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

@Environment(EnvType.CLIENT)
class WindTornadoParticle extends SpriteBillboardParticle {
    private boolean reachedGround;
    private final SpriteProvider spriteProvider;
    private float radius = 1.0F;
    private int start = 0;
    private int miny = 0;

    private WindTornadoParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, SpriteProvider spriteProvider) {
        super(world, x, y, z);

        int particle = (int)(1.0F + (float)this.age / (float)this.maxAge * 4.0F);
        float r1 = (float)this.start + 720.0F * (((float)this.age) / (float)this.maxAge);
        float r2 = 90.0F - 180.0F * (((float)this.age) / (float)this.maxAge);
        float mX = -MathHelper.sin(r1 / 180.0F * 3.1415927F) * MathHelper.cos(r2 / 180.0F * 3.1415927F);
        float mZ = MathHelper.cos(r1 / 180.0F * 3.1415927F) * MathHelper.cos(r2 / 180.0F * 3.1415927F);
        float mY = -MathHelper.sin(r2 / 180.0F * 3.1415927F);
        mX *= this.radius;
        mY *= this.radius;
        mZ *= this.radius;
        float var8 = (float)(particle % 16) / 16.0F;
        float var9 = var8 + 0.0624375F;
        float var10 = (float)(particle / 16) / 16.0F;
        float var11 = var10 + 0.0624375F;
        float var12 = 0.15F * this.scale;
        float var13 = (float)(this.x + (double)mX - prevPosX);
        float var14 = (float)(Math.max(this.y + (double)mY, (double)((float)this.miny + 0.1F)) - prevPosY);
        float var15 = (float)(this.z + (double)mZ - prevPosZ);
        float var16 = 1.0F;
        int i = this.getBrightness(6);
        int j = i >> 16 & '\uffff';
        int k = i & '\uffff';
        /*
        world.setSpawnPos((double)(var13 - f1 * var12 - f4 * var12), (double)(var14 - f2 * var12), (double)(var15 - f3 * var12 - f5 * var12)).func_181673_a((double)var9, (double)var11).func_181666_a(this.field_70552_h * var16, this.field_70553_i * var16, this.field_70551_j * var16, 0.66F * this.field_82339_as).func_181671_a(j, k).func_181675_d();
        world.func_181662_b((double)(var13 - f1 * var12 + f4 * var12), (double)(var14 + f2 * var12), (double)(var15 - f3 * var12 + f5 * var12)).func_181673_a((double)var9, (double)var10).func_181666_a(this.field_70552_h * var16, this.field_70553_i * var16, this.field_70551_j * var16, 0.66F * this.field_82339_as).func_181671_a(j, k).func_181675_d();
        world.func_181662_b((double)(var13 + f1 * var12 + f4 * var12), (double)(var14 + f2 * var12), (double)(var15 + f3 * var12 + f5 * var12)).func_181673_a((double)var8, (double)var10).func_181666_a(this.field_70552_h * var16, this.field_70553_i * var16, this.field_70551_j * var16, 0.66F * this.field_82339_as).func_181671_a(j, k).func_181675_d();
        world.func_181662_b((double)(var13 + f1 * var12 - f4 * var12), (double)(var14 - f2 * var12), (double)(var15 + f3 * var12 - f5 * var12)).func_181673_a((double)var8, (double)var11).func_181666_a(this.field_70552_h * var16, this.field_70553_i * var16, this.field_70551_j * var16, 0.66F * this.field_82339_as).func_181671_a(j, k).func_181675_d();


         */


        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityZ = velocityZ;
        this.colorRed = MathHelper.nextFloat(this.random, 0.7176471F, 0.8745098F);
        this.colorGreen = MathHelper.nextFloat(this.random, 0.0F, 0.0F);
        this.colorBlue = MathHelper.nextFloat(this.random, 0.8235294F, 0.9764706F);
        this.scale *= 0.75F;
        this.maxAge = (int)(20.0D / ((double)this.random.nextFloat() * 0.8D + 0.2D));
        this.reachedGround = false;
        this.collidesWithWorld = false;
        this.spriteProvider = spriteProvider;
        this.setSpriteForAge(spriteProvider);
    }

    @Override
    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;
        if (this.age++ >= this.maxAge) {
            this.markDead();
        } else {
            this.setSpriteForAge(this.spriteProvider);
            if (this.onGround) {
                this.velocityY = 0.0D;
                this.reachedGround = true;
            }

            if (this.reachedGround) {
                this.velocityY += 0.002D;
            }

            this.move(this.velocityX, this.velocityY, this.velocityZ);
            if (this.y == this.prevPosY) {
                this.velocityX *= 1.1D;
                this.velocityZ *= 1.1D;
            }

            this.velocityX *= 0.9599999785423279D;
            this.velocityZ *= 0.9599999785423279D;
            if (this.reachedGround) {
                this.velocityY *= 0.9599999785423279D;
            }

        }
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }
    @Override
    public float getSize(float tickDelta) {
        return this.scale * MathHelper.clamp(((float)this.age + tickDelta) / (float)this.maxAge * 32.0F, 0.0F, 1.0F);
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            return new WindTornadoParticle(clientWorld, d, e, f, g, h, i, this.spriteProvider);
        }
    }
}
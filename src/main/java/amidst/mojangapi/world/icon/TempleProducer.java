package amidst.mojangapi.world.icon;

import amidst.documentation.NotThreadSafe;
import amidst.mojangapi.minecraftinterface.RecognisedVersion;
import amidst.mojangapi.world.coordinates.Resolution;
import amidst.mojangapi.world.oracle.BiomeDataOracle;

@NotThreadSafe
public class TempleProducer extends StructureProducer {
	public TempleProducer(long seed, BiomeDataOracle biomeDataOracle,
			RecognisedVersion recognisedVersion) {
		super(Resolution.CHUNK, new TempleLocationChecker(seed,
				biomeDataOracle, recognisedVersion),
				new TempleWorldIconTypeProvider(biomeDataOracle), false);
	}
}

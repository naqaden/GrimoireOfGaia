package gaia;

public class GaiaReference {

	private GaiaReference() {
	}

	public static final String MOD_ID = "grimoireofgaia";
	public static final String MOD_NAME = "Grimoire of Gaia 3";
	static final String MC_VERSIONS = "1.12.2";
	static final String VERSION = "@VERSION@";

	static final String CLIENT_PROXY_CLASS = "gaia.proxy.ClientProxy";
	static final String SERVER_PROXY_CLASS = "gaia.proxy.CommonProxy";

	static final String DEPENDENCIES = "required-after:forge@[14.23.4.2705,);after:baubles@[1.4.2,]";
}

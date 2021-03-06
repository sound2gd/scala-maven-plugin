package scala_maven;

import org.apache.maven.plugins.annotations.Parameter;

public class Launcher {
    String id;

    String mainClass;

    /**
     * Jvm Arguments
     */
    @Parameter
    protected String[] jvmArgs;

    /**
     * compiler additionnals arguments
     */
    @Parameter
    protected String[] args;
}

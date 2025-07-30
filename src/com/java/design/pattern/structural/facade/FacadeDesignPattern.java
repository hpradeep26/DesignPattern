package com.java.design.pattern.structural.facade;

public class FacadeDesignPattern {

	public static void main(String[] args) {

	}
	

}

class DeploymentFacade{
	
	private VersionControlSystem controlSystem = new VersionControlSystem();
	private BuildSystem  buildSystem = new BuildSystem();
	private TestFramework testFramework = new TestFramework();
	private DeploymentTarget deploymentTarget = new DeploymentTarget();
	
    public boolean deployApplication(String branch, String serverAddress) {
        System.out.println("\nFACADE: --- Initiating FULL DEPLOYMENT for branch: " + branch + " to " + serverAddress + " ---");
        boolean success = true;
        try {
        	
        	controlSystem.pullLatestChanges(branch);
        	
        	if(!buildSystem.compileProject()) {
                System.err.println("FACADE: DEPLOYMENT FAILED - Build compilation failed.");
                return false;

        	}
        	
            String artifactPath = buildSystem.getArtifactPath();
            
            if (!(testFramework.runUnitTest())) {
                System.err.println("FACADE: DEPLOYMENT FAILED - tests failed.");
                return false;
            }
            if (!testFramework.runIntegrationTests()) {
                System.err.println("FACADE: DEPLOYMENT FAILED - Integration tests failed.");
                return false;
            }

            deploymentTarget.transferArtifact(artifactPath, serverAddress);
            deploymentTarget.activateNewVersion(serverAddress);
            
          System.out.println("FACADE: APPLICATION DEPLOYED SUCCESSFULLY to " + serverAddress + "!");

        	
        } catch (Exception e) {
            System.err.println("FACADE: DEPLOYMENT FAILED - An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
            success = false;
        }

    	
    	return success;
    }
}

class VersionControlSystem{
	public void pullLatestChanges(String branch) {
        System.out.println("VCS: Pulling latest changes from '" + branch + "'...");
	}
}

class BuildSystem{
	public boolean compileProject() {
        System.out.println("BuildSystem: Compiling project...");
        return true;
	}
	
    public String getArtifactPath() {
        String path = "target/myapplication-1.0.jar";
        return path;
    }
 }

class TestFramework {
	public boolean runUnitTest() {
        System.out.println("Testing: Running unit tests...");
        return true;
	}
	
    public boolean runIntegrationTests() {
        System.out.println("Testing: Running integration tests...");
        return true;
    }
}

class DeploymentTarget{
    public void transferArtifact(String artifactPath, String server) {
        System.out.println("Deployment: Transferring " + artifactPath + " to " + server + "...");
    }
    
    public void activateNewVersion(String server) {
        System.out.println("Deployment: Activating new version on " + server + "...");
    }
}

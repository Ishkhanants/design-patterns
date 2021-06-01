package behavioral.chain.of.responsibility;

public class Main {
    private static AuthenticationProcessor getChainOfAuthProcessor(){
        AuthenticationProcessor oAuthProcessor = new OAuthAuthenticationProcessor(null);
        return new UsernamePasswordAuthenticationProcessor(oAuthProcessor);
    }

    public static void main(String[] args) {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        boolean isAuthorized = authProcessorChain.isAuthorized(new OAuthTokenProvider());
        System.out.println(isAuthorized);

        AuthenticationProcessor authProcessorChain2 = getChainOfAuthProcessor();
        boolean isAuthorized2 = authProcessorChain2.isAuthorized(new UsernamePasswordProvider());
        System.out.println(isAuthorized2);

        AuthenticationProcessor authProcessorChain3 = getChainOfAuthProcessor();
        boolean isAuthorized3 = authProcessorChain3.isAuthorized(new SamlAuthenticationProvider());
        System.out.println(!isAuthorized3);
    }
}

public class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        if (unliCallText){
            return telcoName + " offers unlimited texts and calls";
        }
        else {
            return telcoName + " does not offer unlimited texts and calls";
        }

    }
}
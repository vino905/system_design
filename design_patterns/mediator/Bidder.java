package mediator;

public class Bidder implements Colleague {

    public AuctionMediator auctionMediator;
    public String name;

    public Bidder(AuctionMediator auctionMediator, String name) {
        this.auctionMediator = auctionMediator;
        this.name = name;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.printf("Bidder: %s has placed the new bid amount of: %d%n", name, bidAmount);
    }

    @Override
    public String getName() {
        return "";
    }
}

package mediator;

public class Test {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Bidder bidder1 = new Bidder(auctionMediator, "bidder1");
        Bidder bidder2 = new Bidder(auctionMediator, "bidder2");
        bidder1.placeBid(5000);
        bidder2.placeBid(6000);
        bidder1.placeBid(6001);
    }
}

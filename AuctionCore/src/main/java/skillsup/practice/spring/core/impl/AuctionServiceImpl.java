package skillsup.practice.spring.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import skillsup.practice.spring.core.AuctionService;
import skillsup.practice.spring.dao.LotDao;
import skillsup.practice.spring.shared.model.Item;
import skillsup.practice.spring.shared.model.Lot;
import skillsup.practice.spring.shared.model.LotHistory;
import skillsup.practice.spring.shared.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {

    @Autowired
    private LotDao lotDao;
    @Value("${auction.duration.days}")
    private int auctionDaysLast = 5;
    @Value("${auction.price.ster.hrn}")
    private int auctionPriceSter = 10;

    public Lot createLot(Item item, User user) {
        Lot lot = new Lot();
        lot.setOwner(user);
        lot.setItem(item);
        lot.setCurrentPrice(BigDecimal.valueOf(123.45));
        lot.setStartPrice(BigDecimal.valueOf(123.45));
        lot.setDatePlaced(LocalDateTime.now());
        lot.setDateEnd(LocalDateTime.now().plusDays(auctionDaysLast));

        return lot;
    }

    public List<Lot> getAllActiveLots() {
        return null;
    }

    public void vote(Lot lot, User buyer) {

    }

    public void vote(Lot lot, User buyer, BigDecimal newPrice) {

    }

    public List<LotHistory> getLotHistory(Lot lot) {
        return null;
    }
}

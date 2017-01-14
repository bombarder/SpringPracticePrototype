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

/**
 * Created by oleksii on 1/14/17.
 */
@Service
public class AuctionServiceImpl implements AuctionService {

	@Autowired
	private LotDao lotDao;
	@Value("${auction.duration.days}")
	private int auctionDaysLast;
	private int auctionPriceStep = 10;

	@Override
	public Lot createLot(Item item, User user) {
		Lot lot = new Lot();
		lot.setOwner(user);
		lot.setItem(item);
		lot.setCurrentPrice(BigDecimal.valueOf(123.45));
		lot.setStartPrice(BigDecimal.valueOf(123.45));
		lot.setDatePlaced(LocalDateTime.now());
		lot.setDateEnd(LocalDateTime.now().plusDays(auctionDaysLast));


		return null;
	}

	@Override
	public List<Lot> getAllActiveLots() {
		return null;
	}

	@Override
	public void vote(Lot lot, User buyer) {

	}

	@Override
	public void vote(Lot lot, User buyer, BigDecimal newPrice) {

	}

	@Override
	public List<LotHistory> getLotHistory(Lot lot) {
		return null;
	}

}

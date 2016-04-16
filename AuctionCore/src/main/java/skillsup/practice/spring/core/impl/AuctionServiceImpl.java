package skillsup.practice.spring.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import skillsup.practice.spring.core.AuctionService;
import skillsup.practice.spring.dao.ItemDao;
import skillsup.practice.spring.dao.LotDao;
import skillsup.practice.spring.dao.LotHistoryDao;
import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.Item;
import skillsup.practice.spring.shared.model.Lot;
import skillsup.practice.spring.shared.model.LotHistory;
import skillsup.practice.spring.shared.model.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by oleksii on 4/16/16.
 */
@Service
public class AuctionServiceImpl implements AuctionService {

	@Value("${auction.duration.days}")
	private int auctionDurationDays;
	@Value("${min.bid.step}")
	private int minBidStep;
	@Autowired
	private ItemDao itemDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private LotDao lotDao;
	@Autowired
	private LotHistoryDao lotHistoryDao;

	@Override
	public Lot createLot(Item item, User user) {
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

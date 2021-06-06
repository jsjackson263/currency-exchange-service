package software.jsj.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import software.jsj.microservices.currencyexchangeservice.entity.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);
}

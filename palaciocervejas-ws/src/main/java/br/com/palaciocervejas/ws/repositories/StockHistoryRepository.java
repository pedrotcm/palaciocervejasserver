package br.com.palaciocervejas.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.palaciocervejas.domain.entities.StockHistory;

public interface StockHistoryRepository extends JpaRepository<StockHistory, Long> {

}

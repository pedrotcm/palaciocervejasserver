package br.com.palaciocervejas.ws.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.palaciocervejas.domain.entities.StockHistory;

public interface StockHistoryRepository extends CrudRepository<StockHistory, Long> {

}

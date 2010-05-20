package br.com.caelum.example.controller;

import java.util.List;

import br.com.caelum.example.infra.Database;
import br.com.caelum.example.model.Item;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import static br.com.caelum.vraptor.view.Results.representation;

@Resource
public class ItemsController {

	private final Database database;
	private final Result result;

	public ItemsController(Database database, Result result) {
		this.database = database;
		this.result = result;
	}

	@Get
	@Path("/items")
	public void lista() {
		System.out.println("bla");
		List<Item> lista = database.lista();
		result.use(representation()).from(lista).serialize();
	}
}

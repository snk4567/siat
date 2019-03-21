package step04.controller;

import step04.model.Model;
import step04.view.EndView;

public class Controller {

	public static void req(int i) {

		if (i == 1) {
			EndView.printAll(Model.getAll());
		} else if (i == 2) {
			EndView.printSize(Model.getAll());

		} else if (i == 3) {
			EndView.printValues(Model.getAll());

		} else {
			EndView.failMsg();
		}

	}
}

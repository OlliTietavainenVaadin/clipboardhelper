package org.vaadin.olli;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        ClipboardHelper clipboardHelper = new ClipboardHelper();
        Button button = new Button("click this button to copy some stuff to the clipboard");
        clipboardHelper.wrap(button);
        add(clipboardHelper);
    }
}

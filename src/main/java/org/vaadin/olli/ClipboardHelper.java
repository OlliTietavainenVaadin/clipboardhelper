package org.vaadin.olli;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

@Tag("clipboard-helper")
@HtmlImport("clipboard-helper.html")
public class ClipboardHelper extends PolymerTemplate<ClipboardHelper.ClipboardHelperModel> {

    @Id("wrapper")
    private Div componentWrapper;

    /**
     * Creates a new ClipboardHelper.
     */
    public ClipboardHelper() {
        getModel().setContent("foo");
    }

    public void wrap(Component component) {
        componentWrapper.add(component);
    }

    /**
     * This model binds properties between ClipboardHelper and clipboard-helper.html
     */
    public interface ClipboardHelperModel extends TemplateModel {
        void setContent(String content);
        String getContent();
    }
}

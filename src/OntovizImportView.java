package ontoviz;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import org.apache.log4j.Logger;
import org.semanticweb.owlapi.model.OWLClass;
import org.protege.editor.owl.ui.view.AbstractOWLViewComponent;
import org.protege.editor.owl.ui.view.cls.AbstractOWLClassViewComponent;


public class OntovizImportView extends AbstractOWLClassViewComponent{
  private static final Logger log = Logger.getLogger(OntovizImportView.class);
  private JPanel helloPanel;

  @Override
  public void initialiseClassView() throws Exception {
      setLayout(new BorderLayout());
      helloPanel = new JPanel();
      helloPanel.add(new JLabel("Successfully loaded"));
      add(helloPanel, BorderLayout.CENTER);
      log.info("OntovizImportView Component initialized");
  }

  @Override
  protected OWLClass updateView(OWLClass owlClass) {
    return null;
  }

  @Override
	public void disposeView() {
		// TODO Auto-generated method stub

	}
}

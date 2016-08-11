package ontoviz.test;

import java.awt.BorderLayout;

import org.apache.log4j.Logger;
import org.protege.editor.owl.ui.view.AbstractOWLViewComponent;

public class HelloWorldComponent extends AbstractOWLViewComponent{

  private static final Logger log = Logger.getLogger(HelloWorldComponent.class);
  private HelloWorldPanel helloPanel;

  @Override
  protected void initialiseOWLView() throws Exception {
      setLayout(new BorderLayout());
      helloPanel = new HelloWorldPanel();
      add(helloPanel, BorderLayout.CENTER);
      log.info("Hello World View Component initialized");
  }

  @Override
  protected void disposeOWLView() {
      log.info("Hello World View Component disposed");
  }
}

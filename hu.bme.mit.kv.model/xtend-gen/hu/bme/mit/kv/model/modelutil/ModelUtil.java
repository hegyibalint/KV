package hu.bme.mit.kv.model.modelutil;

import hu.bme.mit.kv.model.railroadmodel.ModelFactory;
import hu.bme.mit.kv.model.railroadmodel.RailRoadModel;
import hu.bme.mit.kv.model.railroadmodel.Section;
import hu.bme.mit.kv.model.railroadmodel.Train;
import hu.bme.mit.kv.model.railroadmodel.Turn;
import hu.bme.mit.kv.model.railroadmodel.Turnout;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelUtil {
  @Extension
  private static ModelFactory factory = ModelFactory.eINSTANCE;
  
  public static RailRoadModel createReadyModel() {
    RailRoadModel _xblockexpression = null;
    {
      RailRoadModel root = ModelUtil.factory.createRailRoadModel();
      for (int i = 1; (i != 8); i++) {
        {
          Turnout turnout = ModelUtil.factory.createTurnout();
          turnout.setId(i);
          EList<Section> _sections = root.getSections();
          _sections.add(turnout);
        }
      }
      for (int i = 8; (i != 24); i++) {
        if ((((i != 0x12) && (i != 0xF)) && (i != 0x11))) {
          Section section = ModelUtil.factory.createSection();
          section.setId(i);
          EList<Section> _sections = root.getSections();
          _sections.add(section);
        }
      }
      Turn turnerF = ModelUtil.factory.createTurn();
      turnerF.setId(0xF);
      Turn turner11 = ModelUtil.factory.createTurn();
      turner11.setId(0x11);
      EList<Section> _sections = root.getSections();
      _sections.add(turnerF);
      EList<Section> _sections_1 = root.getSections();
      _sections_1.add(turner11);
      Turnout turnout4 = ModelUtil.getTurnoutByID(root, 0x4);
      Turnout turnout7 = ModelUtil.getTurnoutByID(root, 0x7);
      Section section15 = ModelUtil.getSectionByID(root, 0x15);
      Section section10 = ModelUtil.getSectionByID(root, 0x10);
      Section sectionE = ModelUtil.getSectionByID(root, 0xE);
      Section section16 = ModelUtil.getSectionByID(root, 0x16);
      turnout4.setClockwise(turnout7);
      turnout7.setCounterClockwise(turnout4);
      turnout4.setCounterClockwise(section15);
      turnout4.setNotConnectedSection(section10);
      turnout7.setClockwise(sectionE);
      turnout7.setNotConnectedSection(section16);
      section15.setClockwise(turnout4);
      section10.setClockwise(turnout4);
      sectionE.setCounterClockwise(turnout7);
      section16.setCounterClockwise(turnout7);
      ModelUtil.connectSectionToTurnout(root, 0x1, 0xE, 0xD, 0x9, true);
      ModelUtil.connectSectionToTurnout(root, 0x2, 0xC, 0x16, 0xF, false);
      ModelUtil.connectSectionToTurnout(root, 0x3, 0x8, 0x17, 0xB, true);
      ModelUtil.connectSectionToTurnout(root, 0x5, 0x10, 0x11, 0xA, false);
      ModelUtil.connectSectionToTurnout(root, 0x6, 0x15, 0x13, 0x14, false);
      ModelUtil.connectSectionToSection(root, 0xC, 0xA);
      ModelUtil.connectSectionToSection(root, 0xD, 0x8);
      ModelUtil.connectSectionToSection(root, 0x17, 0x14);
      ModelUtil.connectSectionToSection(root, 0xB, 0x13);
      Section sec11 = ModelUtil.getSectionByID(root, 0x11);
      Section secF = ModelUtil.getSectionByID(root, 0xF);
      sec11.setCounterClockwise(secF);
      secF.setCounterClockwise(sec11);
      Train train1 = ModelUtil.factory.createTrain();
      Train train2 = ModelUtil.factory.createTrain();
      train1.setId(1);
      train2.setId(2);
      Section _sectionByID = ModelUtil.getSectionByID(root, 0x15);
      train1.setCurrentlyOn(_sectionByID);
      train1.setGoingClockwise(true);
      Section _sectionByID_1 = ModelUtil.getSectionByID(root, 0x8);
      train2.setCurrentlyOn(_sectionByID_1);
      train2.setGoingClockwise(true);
      EList<Train> _trains = root.getTrains();
      _trains.add(train1);
      EList<Train> _trains_1 = root.getTrains();
      _trains_1.add(train2);
      _xblockexpression = root;
    }
    return _xblockexpression;
  }
  
  public static String toGraphViz(final RailRoadModel root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("digraph{");
    _builder.newLine();
    {
      EList<Section> _sections = root.getSections();
      for(final Section sec : _sections) {
        _builder.append("\t");
        int _id = sec.getId();
        String _hexa = ModelUtil.toHexa(_id);
        _builder.append(_hexa, "\t");
        _builder.append(" -> ");
        Section _clockwise = sec.getClockwise();
        int _id_1 = 0;
        if (_clockwise!=null) {
          _id_1=_clockwise.getId();
        }
        String _hexa_1 = ModelUtil.toHexa(_id_1);
        _builder.append(_hexa_1, "\t");
        _builder.append("[label=\"clockwise\"];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        int _id_2 = sec.getId();
        String _hexa_2 = ModelUtil.toHexa(_id_2);
        _builder.append(_hexa_2, "\t");
        _builder.append(" -> ");
        Section _counterClockwise = sec.getCounterClockwise();
        int _id_3 = 0;
        if (_counterClockwise!=null) {
          _id_3=_counterClockwise.getId();
        }
        String _hexa_3 = ModelUtil.toHexa(_id_3);
        _builder.append(_hexa_3, "\t");
        _builder.append("[label=\"counterClockwise\"];");
        _builder.newLineIfNotEmpty();
        {
          if ((sec instanceof Turnout)) {
            {
              boolean _isTwoSectionsInClockwiseDirection = ((Turnout)sec).isTwoSectionsInClockwiseDirection();
              if (_isTwoSectionsInClockwiseDirection) {
                _builder.append("\t");
                int _id_4 = ((Turnout)sec).getId();
                String _hexa_4 = ModelUtil.toHexa(_id_4);
                _builder.append(_hexa_4, "\t");
                _builder.append(" -> ");
                Section _notConnectedSection = ((Turnout)sec).getNotConnectedSection();
                int _id_5 = _notConnectedSection.getId();
                String _hexa_5 = ModelUtil.toHexa(_id_5);
                _builder.append(_hexa_5, "\t");
                _builder.append("[label=\"currentlyNotConnectedClockwise\"]");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                int _id_6 = ((Turnout)sec).getId();
                String _hexa_6 = ModelUtil.toHexa(_id_6);
                _builder.append(_hexa_6, "\t");
                _builder.append(" -> ");
                Section _notConnectedSection_1 = ((Turnout)sec).getNotConnectedSection();
                int _id_7 = _notConnectedSection_1.getId();
                String _hexa_7 = ModelUtil.toHexa(_id_7);
                _builder.append(_hexa_7, "\t");
                _builder.append("[label=\"currentlyNotConnectedCounterclockwise\"]");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String toHexa(final int a) {
    return String.format("%X", Integer.valueOf(a));
  }
  
  public static void connectSectionToTurnout(final RailRoadModel model, final int turnoutID, final int onlySection, final int oneOfTwoSections, final int secondOfTwoSections, final boolean twoSectionsInClockwiseDirection) {
    Turnout turnout = ModelUtil.getTurnoutByID(model, turnoutID);
    Section onlyConnection = ModelUtil.getSectionByID(model, onlySection);
    Section first = ModelUtil.getSectionByID(model, oneOfTwoSections);
    Section second = ModelUtil.getSectionByID(model, secondOfTwoSections);
    turnout.setTwoSectionsInClockwiseDirection(twoSectionsInClockwiseDirection);
    if (twoSectionsInClockwiseDirection) {
      turnout.setCounterClockwise(onlyConnection);
      onlyConnection.setClockwise(turnout);
      turnout.setClockwise(first);
      first.setCounterClockwise(turnout);
      turnout.setNotConnectedSection(second);
      second.setCounterClockwise(turnout);
    } else {
      turnout.setClockwise(onlyConnection);
      onlyConnection.setCounterClockwise(turnout);
      turnout.setCounterClockwise(first);
      first.setClockwise(turnout);
      turnout.setNotConnectedSection(second);
      second.setClockwise(turnout);
    }
  }
  
  public static Section getSectionByID(final RailRoadModel model, final int id) {
    EList<Section> _sections = model.getSections();
    final Function1<Section, Boolean> _function = (Section sec) -> {
      int _id = sec.getId();
      return Boolean.valueOf((_id == id));
    };
    Iterable<Section> _filter = IterableExtensions.<Section>filter(_sections, _function);
    return IterableExtensions.<Section>head(_filter);
  }
  
  public static Turnout getTurnoutByID(final RailRoadModel model, final int id) {
    EList<Section> _sections = model.getSections();
    final Function1<Section, Boolean> _function = (Section sec) -> {
      int _id = sec.getId();
      return Boolean.valueOf((_id == id));
    };
    Iterable<Section> _filter = IterableExtensions.<Section>filter(_sections, _function);
    Section _head = IterableExtensions.<Section>head(_filter);
    return ((Turnout) _head);
  }
  
  public static void connectSectionToSection(final RailRoadModel model, final int clockwise, final int counterClockwise) {
    Section a = ModelUtil.getSectionByID(model, clockwise);
    Section b = ModelUtil.getSectionByID(model, counterClockwise);
    a.setClockwise(b);
    b.setCounterClockwise(a);
  }
  
  public static void switchTurnout(final Turnout t) {
    boolean _isTwoSectionsInClockwiseDirection = t.isTwoSectionsInClockwiseDirection();
    if (_isTwoSectionsInClockwiseDirection) {
      Section cw = t.getClockwise();
      Section _notConnectedSection = t.getNotConnectedSection();
      t.setClockwise(_notConnectedSection);
      t.setNotConnectedSection(cw);
    } else {
      Section ccw = t.getCounterClockwise();
      Section _notConnectedSection_1 = t.getNotConnectedSection();
      t.setCounterClockwise(_notConnectedSection_1);
      t.setNotConnectedSection(ccw);
    }
  }
}

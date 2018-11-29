package ca.csf.dfc.Dessin.Modele;

import Idessinable;
import java.util.Vector;
import int;
import IObservable;
import Observable;
import IDessinable;
import Color;

public class FormeGraphique extends IDessinable, IDessinable, Observable implements Idessinable, IObservable {

  public Color m_couleurContour;

  public int m_epaisseur;

  public Emplacement m_emplacement;

    public Vector  myfrmDessiner;
    public Vector  myModeleDessin;
    public Vector  myEmplacement;

  public void dessinerPlein() {
  }

  public void dessinerVide() {
  }

  public void getCouleur() {
  }

  public void setCouleur(Color p_couleurContour, Color p_CouleurRemplissage) {
  }

  public void getEpaisseur() {
  }

  public void setEpaisseur(int p_epaisseur) {
  }

  public void getEmplacement() {
  }

  public void setEmplacement(Emplacement p_emplacement) {
  }

}
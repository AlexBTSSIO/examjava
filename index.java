

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChiffrementTest 
{

	@Test
	void testTranspositionChiffre() 
	{
		ProtocoleChiffremment transposition = new TranspositionInverse();
		assertEquals("ytreza", transposition.chiffre("azerty"));
		assertEquals("123456789", transposition.chiffre("987654321"));
	}

	@Test
	void testTranspositionDechiffre() 
	{
		ProtocoleChiffremment transposition = new TranspositionInverse();
		assertEquals("ytreza", transposition.dechiffre("azerty"));
		assertEquals("123456789", transposition.dechiffre("987654321"));
	}
	
	@Test
	void testSubstitutionChiffre() 
	{
		ProtocoleChiffrementACle substitution = new SubstitutionMonoalphabetique();
		substitution.setCle("azertyuiopqsdfghjklmwxcvbn");
		assertEquals("zgfpgwk", substitution.chiffre("bonjour"));
		assertEquals("awktxgok", substitution.chiffre("aurevoir"));
	}

	@Test
	void testSubstitutionDechiffre() 
	{
		ProtocoleChiffrementACle substitution = new SubstitutionMonoalphabetique();
		substitution.setCle("azertyuiopqsdfghjklmwxcvbn");
		assertEquals("bonjour", substitution.dechiffre("zgfpgwk"));
		assertEquals("aurevoir", substitution.dechiffre("awktxgok"));
	}

}
/**
 * Chiffre les messages en inversant l'ordre des lettres.
 */

public class TranspositionInverse implements ProtocoleChiffremment
{

	@Override
	public String chiffre(String message) 
	{
	}

	@Override
	public String dechiffre(String message) 
	{
	}
	
}

public interface ProtocoleChiffrementACle extends ProtocoleChiffremment
{
	public abstract void setCle(String cle);
	public abstract String getCle();
}
/**
 * Chiffre les messages avec une table de substitution.
 * si la table de substition est "zybcdefghijklmnopqrstuvwxa"
 * alors les 'a' seront remplacés par des 'z', 
 * les 'b' seront remplacés par des 'y'
 * les 'c' seront remplacés par des 'b'
 * etc.
 **/

public class SubstitutionMonoalphabetique 
{
	}
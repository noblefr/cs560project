package GameState;

import Characters.MainCharacter;

/**
 * This class detects whether or not the character is nearby to
 * initiate a state change in the game. This is for the second clue
 * after the clue is found on the ground. It simply checks to see
 * if the characters position is within the bounds and then initiates
 * the change.
 *
 */

public class AreaClueDetector {

	/**
	 * This function is meant to advance the gamestate if the player is in the position where the next clue is.
	 * @param gameStateMaster
	 * @param character
	 * @param minX
	 * @param maxX
	 * @param minY
	 * @param maxY
	 */
	public void Detect(GameStateMaster gameStateMaster, MainCharacter character, int minX, int maxX, int minY, int maxY) {
		if (character.XPosition > minX && character.XPosition < maxX) // If it is
																	// near the
																	// bush
		{
			if (character.YPosition < maxY && character.YPosition > minY) {
				gameStateMaster.GameState++;
			}
		}
	}
}

/**
 * Copyright 2004-2006 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 * 
 * Permission is hereby granted, free of charge, to use and distribute
 * this software and its documentation without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of this work, and to
 * permit persons to whom this work is furnished to do so, subject to
 * the following conditions:
 * 
 * 1. The code must retain the above copyright notice, this list of
 *    conditions and the following disclaimer.
 * 2. Any modifications must be clearly marked as such.
 * 3. Original authors' names are not deleted.
 * 4. The authors' names are not used to endorse or promote products
 *    derived from this software without specific prior written
 *    permission.
 *
 * DFKI GMBH AND THE CONTRIBUTORS TO THIS WORK DISCLAIM ALL WARRANTIES WITH
 * REGARD TO THIS SOFTWARE, INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS, IN NO EVENT SHALL DFKI GMBH NOR THE
 * CONTRIBUTORS BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL
 * DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
 * PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF
 * THIS SOFTWARE.
 */

package de.dfki.lt.signalproc.window;

// TODO: Auto-generated Javadoc
/**
 * The Class HammingWindow.
 *
 * @author Marc Schr&ouml;der
 */
public class HammingWindow extends Window {
	
	/**
	 * Instantiates a new hamming window.
	 *
	 * @param length the length
	 */
	public HammingWindow(int length) {
		super(length);
	}

	/**
	 * Instantiates a new hamming window.
	 *
	 * @param length the length
	 * @param prescalingFactor the prescaling factor
	 */
	public HammingWindow(int length, double prescalingFactor) {
		super(length, prescalingFactor);
	}

	/* (non-Javadoc)
	 * @see de.dfki.lt.signalproc.window.Window#initialise()
	 */
	protected void initialise() {
		boolean prescale = (prescalingFactor != 1.);
		for (int i = 0; i < window.length; i++) {
			window[i] = 0.54 - 0.46 * Math.cos(i * 2 * Math.PI / (window.length - 1));
			if (prescale)
				window[i] *= prescalingFactor;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Hamming window";
	}

}

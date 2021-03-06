/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.program.util;

import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Program;

/**
 * The <CODE>FunctionCallFixupFieldLocation</CODE> class provides specific information
 * about the Function call-fixup field within a program location.
 */
public class ThunkedFunctionFieldLocation extends FunctionLocation {

	/**
	 * Construct a new FunctionCallFixupFieldLocation object.
	 * 
	 * @param program
	 * @param locationAddr the address of the listing location (i.e., referent code unit)
	 * @param functionAddr the function address
	 * @param callFixupName the function call-fixup field text String at this location.
	 * @param charOffset field character offset
	 */
	public ThunkedFunctionFieldLocation(Program program, Address locationAddr,
			Address functionAddr, Address thunkedFunctionAddr, int charOffset) {

		super(program, locationAddr, functionAddr, 0, 0, charOffset);
		refAddr = thunkedFunctionAddr;
	}

	/**
	 * Default constructor needed for restoring
	 * a program location from XML
	 */
	public ThunkedFunctionFieldLocation() {
	}

}

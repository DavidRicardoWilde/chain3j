package org.chain3j.abi.datatypes.generated;

import java.util.List;
import org.chain3j.abi.datatypes.StaticArray;
import org.chain3j.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.chain3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/chain3j/chain3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray11<T extends Type> extends StaticArray<T> {
    public StaticArray11(List<T> values) {
        super(11, values);
    }

    @SafeVarargs
    public StaticArray11(T... values) {
        super(11, values);
    }
}

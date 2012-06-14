/**
 * Tests all methods on MyModuleObject
 * 
*/
package org.openmrs.module.pharmdrug;

import junit.framework.Assert;
import org.junit.Test;
import org.openmrs.api.context.Context;
import org.openmrs.module.basicmodule.Note;
import org.openmrs.module.basicmodule.NoteService;
import org.openmrs.module.basicmodule.impl.NoteServiceImpl;
import org.openmrs.test.BaseModuleContextSensitiveTest;

/**
 * Make sure that MyModuleObject runs fine with a null parameter to FeatureX
 *
 * @author Yan
 */
public class NoteServiceTest extends BaseModuleContextSensitiveTest {
    private Note note;

    @Test
    public void shouldGetNoteObjectWithNullParameter() throws Exception {
     NoteService service = Context.getService(NoteService.class);
     Note obj = service.saveNote(note);
     Assert.assertNull(obj);
    }
}

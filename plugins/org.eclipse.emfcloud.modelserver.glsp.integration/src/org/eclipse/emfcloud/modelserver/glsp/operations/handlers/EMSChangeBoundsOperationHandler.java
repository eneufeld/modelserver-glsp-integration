/********************************************************************************
 * Copyright (c) 2021 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.emfcloud.modelserver.glsp.operations.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emfcloud.modelserver.glsp.notation.Shape;
import org.eclipse.emfcloud.modelserver.glsp.notation.integration.EMSNotationModelServerAccess;
import org.eclipse.emfcloud.modelserver.glsp.notation.integration.EMSNotationModelState;
import org.eclipse.glsp.server.operations.ChangeBoundsOperation;
import org.eclipse.glsp.server.protocol.GLSPServerException;
import org.eclipse.glsp.server.types.ElementAndBounds;

public class EMSChangeBoundsOperationHandler
   extends EMSBasicOperationHandler<ChangeBoundsOperation, EMSNotationModelState, EMSNotationModelServerAccess> {

   @Override
   public void executeOperation(final ChangeBoundsOperation operation, final EMSNotationModelState modelState,
      final EMSNotationModelServerAccess modelServerAccess) {

      Map<Shape, ElementAndBounds> changeBoundsMap = new HashMap<>();
      for (ElementAndBounds element : operation.getNewBounds()) {
         modelState.getIndex().getNotation(element.getElementId(), Shape.class).ifPresent(notationElement -> {
            changeBoundsMap.put(notationElement, element);
         });
      }
      modelServerAccess.changeBounds(changeBoundsMap).thenAccept(response -> {
         if (!response.body()) {
            throw new GLSPServerException("Could not change bounds: " + changeBoundsMap.toString());
         }
      });
   }

   @Override
   public String getLabel() { return "Change bounds"; }

}

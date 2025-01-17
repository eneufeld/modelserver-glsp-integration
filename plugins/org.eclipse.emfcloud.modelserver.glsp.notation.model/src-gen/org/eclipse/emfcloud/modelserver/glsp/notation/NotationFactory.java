/**
 * Copyright (c) 2021 EclipseSource and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 */
package org.eclipse.emfcloud.modelserver.glsp.notation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.modelserver.glsp.notation.NotationPackage
 * @generated
 */
public interface NotationFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   NotationFactory eINSTANCE = org.eclipse.emfcloud.modelserver.glsp.notation.impl.NotationFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Shape</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Shape</em>'.
    * @generated
    */
   Shape createShape();

   /**
    * Returns a new object of class '<em>Edge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Edge</em>'.
    * @generated
    */
   Edge createEdge();

   /**
    * Returns a new object of class '<em>Diagram</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Diagram</em>'.
    * @generated
    */
   Diagram createDiagram();

   /**
    * Returns a new object of class '<em>Semantic Proxy</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Semantic Proxy</em>'.
    * @generated
    */
   SemanticProxy createSemanticProxy();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   NotationPackage getNotationPackage();

} //NotationFactory

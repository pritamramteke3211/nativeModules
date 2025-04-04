import {StyleSheet, Text, View} from 'react-native';
import React from 'react';
import NativeToast from './src/components/basicComponents/NativeToast';
import NativeFingerPrintAuth from './src/components/advancedComponents/NativeFingerPrintAuth';

const App = () => {
  // return <NativeToast />;
  return <NativeFingerPrintAuth />;
};

export default App;

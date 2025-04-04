import {Button, NativeModules, StyleSheet, Text, View} from 'react-native';
import React from 'react';

const {ToastModule} = NativeModules;

const NativeToast = () => {
  return (
    <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
      <Button
        title="Show Toast"
        onPress={() => ToastModule.showToast('Hello World', 'SHORT')}
      />
    </View>
  );
};

export default NativeToast;

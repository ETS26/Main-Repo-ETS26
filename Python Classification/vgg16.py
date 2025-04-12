import cv2
import numpy as np
from tensorflow.keras.datasets import mnist
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dropout
from tensorflow.keras.layers import Flatten
from tensorflow.keras.layers import Dense
from tensorflow.keras.models import Model
from tensorflow.keras.layers import Conv2D
from tensorflow.keras.layers import MaxPooling2D
from tensorflow.keras.optimizers.legacy import SGD
from tensorflow.keras.optimizers import Adam
from tensorflow.keras.applications.vgg16 import VGG16
from keras import utils


(X_train, y_train), (X_test, y_test) = mnist.load_data()

X_train=[ cv2.cvtColor(cv2.resize(i,(32,32)),cv2.COLOR_GRAY2RGB).astype(np.float32) for i in X_train]
X_test=[ cv2.cvtColor(cv2.resize(i,(32,32)),cv2.COLOR_GRAY2RGB).astype(np.float32) for i in X_test]

# reshape to be [samples][width][height][channels]
# X_train = X_train.reshape(X_train.shape[0], 28, 28,3).astype(np.float32)
# X_test = X_test.reshape(X_test.shape[0], 28, 28,3).astype(np.float32)
# print(X_train.shape)
# normalize inputs from 0-255 to 0-1
X_train = np.array(X_train) / 255
X_test = np.array(X_test) / 255
# one hot encode outputs
y_train = utils.to_categorical(y_train)
y_test = utils.to_categorical(y_test)
num_classes = y_test.shape[1]

# model = Sequential()
# model.add(Conv2D(10,(5, 5), input_shape=(28, 28,1),padding='same', activation='relu')) # padding='same'
# model.add(Conv2D(4,(3, 3),padding='same', activation='relu'))
# model.add(MaxPooling2D(pool_size=(2, 2))) # strides=2
# model.add(Dropout(0.2))
# model.add(Flatten())
# model.add(Dense(200, activation='relu'))
# model.add(Dense(num_classes, activation='softmax'))

model_temp = VGG16(include_top=False, input_shape=(32,32,3))

for layer in model_temp.layers:
    layer.trainable = False

c1=Flatten()(model_temp.output)
c2 = Dense(num_classes, activation='softmax')(c1)
model = Model(inputs=model_temp.input, outputs=c2)
print(model.summary())

optim = Adam(0.001)
model.compile(loss='categorical_crossentropy', optimizer=optim, metrics=['accuracy'])

model.fit(X_train, y_train, validation_data=(X_test, y_test), epochs=10, batch_size=200, verbose=2)

_,train_scores = model.evaluate(X_train, y_train)
_,test_scores = model.evaluate(X_test, y_test)
print('CNN Train Accuracy: %.2f , Test Accuracy: %.2f' % (train_scores*100,test_scores*100))

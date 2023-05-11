import cv2
img = cv2.imread('img.jpg')

face = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

faces = face.detectMultiScale(gray, 1.9,5)

for(x, y, w, h) in faces:
    mosaic = cv2.resize(img[y: y + h, x: x + w], None, fx=0.05, fy=0.05, interpolation=cv2.INTER_NEAREST)
    img[y: y + h, x: x + w] = cv2.resize(mosaic, (w, h), interpolation=cv2.INTER_NEAREST)

cv2.imshow('face find', img)
cv2.waitKey(0)
cv2.destroyAllWindows()

path=$1
oldName=$2

cd $path

for f in *
do
  if [[ "$f" == *"$oldName"* ]]
  then

    cp $f ${f//$oldName/"light_gray"}
    cp $f ${f//$oldName/"gray"}
    cp $f ${f//$oldName/"black"}
    cp $f ${f//$oldName/"brown"}
    cp $f ${f//$oldName/"red"}
    cp $f ${f//$oldName/"orange"}
    cp $f ${f//$oldName/"yellow"}
    cp $f ${f//$oldName/"lime"}
    cp $f ${f//$oldName/"green"}
    cp $f ${f//$oldName/"cyan"}
    cp $f ${f//$oldName/"light_blue"}
    cp $f ${f//$oldName/"blue"}
    cp $f ${f//$oldName/"purple"}
    cp $f ${f//$oldName/"magenta"}
    cp $f ${f//$oldName/"pink"}
  fi
done

echo "Copied all files"
